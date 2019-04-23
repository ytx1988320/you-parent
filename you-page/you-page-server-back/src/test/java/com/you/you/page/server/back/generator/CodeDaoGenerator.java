package com.you.you.page.server.back.generator;

import com.google.common.base.CaseFormat;
import com.you.you.page.common.consts.ProjectConstant;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Yvan
 * @title 代码生成器，根据数据表名称生成对应的dao层代码简化开发
 * @date 2018/1/19
 */
public class CodeDaoGenerator {

    private static Properties properties;
    private static final String APPLICATION_PROPERTIES_NAME = "application.properties";
    private static final String APPLICATION_YAML_NAME = "application-dev.yaml";
    private static final String PROJECT_NAME="\\you-page-server-back";
    private static final String BASE_PACKAGE = ProjectConstant.BASE_PACKAGE + ".back";

    public static void main(String[] args) throws IOException {
        loadProperties();
        genCodeByCustomModelName("t_user", "User");
    }

    public static void genCode(String... tableNames) {
        for (String tableName : tableNames) {
            genCodeByCustomModelName(tableName, null);
        }
    }

    public static void genCodeByCustomModelName(String tableName, String modelName) {
        genDao(tableName, modelName);
    }

    public static void genDao(String tableName, String modelName) {
        List<String> warnings;
        MyBatisGenerator generator;

        try {
            Configuration config = new Configuration();
            config.addContext(mybatisGeneratorConfiguration(tableName, modelName));
            config.validate();

            DefaultShellCallback callback = new DefaultShellCallback(true);
            warnings = new ArrayList<>();
            generator = new MyBatisGenerator(config, callback, warnings);
            generator.generate(null);
        } catch (Exception e) {
            throw new RuntimeException("生成dao层代码失败", e);
        }

        if (generator.getGeneratedJavaFiles().isEmpty() || generator.getGeneratedXmlFiles().isEmpty()) {
            throw new RuntimeException("生成dao层代码失败: " + warnings);
        }
        if (StringUtils.isEmpty(modelName)) {
            modelName = tableNameConvertUpperCamel(tableName);
        }

        System.out.println(modelName + ".java 生成成功");
        System.out.println(modelName + "Mapper.java 生成成功");
        System.out.println(modelName + "Mapper.xml 生成成功");
    }

    private static Context mybatisGeneratorConfiguration(String tableName, String modelName) {
        Context context = new Context(ModelType.FLAT);
        context.setId("MysqlContext");
        context.setTargetRuntime("com.you.you.page.server.back.generator.mybatis.TableMyBatis3Impl");
        context.addProperty(PropertyRegistry.CONTEXT_AUTO_DELIMIT_KEYWORDS, "true");
        context.addProperty(PropertyRegistry.CONTEXT_BEGINNING_DELIMITER, "`");
        context.addProperty(PropertyRegistry.CONTEXT_ENDING_DELIMITER, "`");
        context.addProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING, "utf-8");
        context.addProperty(PropertyRegistry.CONTEXT_JAVA_FORMATTER, "org.mybatis.generator.api.dom.DefaultJavaFormatter");
        context.addProperty(PropertyRegistry.CONTEXT_XML_FORMATTER, "org.mybatis.generator.api.dom.DefaultXmlFormatter");

        PluginConfiguration serializablePlugin = new PluginConfiguration();
        serializablePlugin.setConfigurationType("org.mybatis.generator.plugins.SerializablePlugin");
        context.addPluginConfiguration(serializablePlugin);
        PluginConfiguration toStringPlugin = new PluginConfiguration();
        toStringPlugin.setConfigurationType("org.mybatis.generator.plugins.ToStringPlugin");
        context.addPluginConfiguration(toStringPlugin);

        CommentGeneratorConfiguration commentGeneratorConfiguration = new CommentGeneratorConfiguration();
        commentGeneratorConfiguration.setConfigurationType("org.mybatis.generator.internal.DefaultCommentGenerator");
        commentGeneratorConfiguration.addProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS, "true");
        commentGeneratorConfiguration.addProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE, "true");
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);

        JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setDriverClass(properties.getProperty("datasource.driverClassName"));
        jdbcConnectionConfiguration.setConnectionURL(properties.getProperty("datasource.master.url"));
        jdbcConnectionConfiguration.setUserId(properties.getProperty("datasource.master.username"));
        jdbcConnectionConfiguration.setPassword(properties.getProperty("datasource.master.password"));
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);

        JavaTypeResolverConfiguration javaTypeResolverConfiguration = new JavaTypeResolverConfiguration();
        javaTypeResolverConfiguration.addProperty(PropertyRegistry.TYPE_RESOLVER_FORCE_BIG_DECIMALS, "true");
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
        System.out.printf("===========:"+ProjectConstant.PROJECT_PATH +PROJECT_NAME+ ProjectConstant.JAVA_PATH);
        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject(ProjectConstant.PROJECT_PATH +PROJECT_NAME+ ProjectConstant.JAVA_PATH);
        javaModelGeneratorConfiguration.setTargetPackage(BASE_PACKAGE + ".dao");
        javaModelGeneratorConfiguration.addProperty(PropertyRegistry.ANY_ENABLE_SUB_PACKAGES, "true");
        javaModelGeneratorConfiguration.addProperty(PropertyRegistry.MODEL_GENERATOR_TRIM_STRINGS, "true");
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetProject(ProjectConstant.PROJECT_PATH +PROJECT_NAME+ ProjectConstant.JAVA_PATH);
        sqlMapGeneratorConfiguration.setTargetPackage(BASE_PACKAGE + ".mapper.schema");
        sqlMapGeneratorConfiguration.addProperty(PropertyRegistry.ANY_ENABLE_SUB_PACKAGES, "false");
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);

        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetProject(ProjectConstant.PROJECT_PATH +PROJECT_NAME+ ProjectConstant.JAVA_PATH);
        javaClientGeneratorConfiguration.setTargetPackage(BASE_PACKAGE + ".mapper");
        javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
        javaClientGeneratorConfiguration.addProperty(PropertyRegistry.ANY_ENABLE_SUB_PACKAGES, "false");
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);

        TableConfiguration tableConfiguration = new TableConfiguration(context);
        tableConfiguration.setTableName(tableName);
        tableConfiguration.setGeneratedKey(new GeneratedKey("id","MySQL", true, "post"));
        tableConfiguration.setSelectByPrimaryKeyQueryId("true");
        tableConfiguration.setSelectByExampleQueryId("true");
        tableConfiguration.addProperty(PropertyRegistry.TABLE_USE_ACTUAL_COLUMN_NAMES, "false");
        if (StringUtils.isNotEmpty(modelName)) {
            tableConfiguration.setDomainObjectName(modelName);
        }
        context.addTableConfiguration(tableConfiguration);

        return context;
    }

    private static void loadProperties() throws IOException {
        Yaml yaml = new Yaml();
        Map map = yaml.loadAs(new ClassPathResource(APPLICATION_YAML_NAME).getInputStream(), Map.class);
        Map datasource = (Map) map.get("datasource");

        String driverClassName = datasource.get("driverClassName").toString();
        System.out.println(driverClassName);


        String url = datasource.get("url").toString();
        String username = datasource.get("username").toString();
        String password = datasource.get("password").toString();

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        properties = PropertiesLoaderUtils.loadAllProperties(APPLICATION_YAML_NAME);
        properties.setProperty("datasource.driverClassName", driverClassName);
        properties.setProperty("datasource.master.url", url);
        properties.setProperty("datasource.master.username", username);
        properties.setProperty("datasource.master.password", password);

        System.out.println(properties);
    }

    private static String tableNameConvertUpperCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());
    }
}
