package com.you.you.page.server.back.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据源配置
 * 配置DynamicDataSource代替普通dataSource
 *
 * @author follow
 * @title 数据源配置
 * @date 2018/4/15
 * @since 1.0-SNAPSHOT.0
 */
@Configuration
public class DataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    /****************************************************************/
    /**                          数据源配置                          **/
    /****************************************************************/
    @Value("${datasource.url}")
    private String masterUrl;

    @Value("${datasource.username}")
    private String masterUsername;

    @Value("${datasource.password}")
    private String masterPassword;


    /**
     * 连接池公共配置
     */
    @Value("${datasource.connectionTimeout}")
    private Long connectionTimeout;

    @Value("${datasource.idleTimeout}")
    private Long idleTimeout;

    @Value("${datasource.maxLifetime}")
    private Long maxLifetime;

    @Value("${datasource.maximumPoolSize}")
    private Integer maximumPoolSize;

    @Value("${datasource.minIdle}")
    private Integer minIdle;

    @Bean(name = "dataSource", destroyMethod = "close")
    public DataSource dataSource() {
        return createDataSource(masterUrl, masterUsername, masterPassword);
    }


    private DataSource createDataSource(String url, String username, String password) {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setInitialSize(minIdle);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maximumPoolSize);
        datasource.setMaxWait(maxLifetime);
        datasource.setTimeBetweenEvictionRunsMillis(60000);
        datasource.setMinEvictableIdleTimeMillis(300000);
        datasource.setValidationQuery("SELECT 1 FROM DUAL");
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(false);
        datasource.setTestOnReturn(false);
        try {
            datasource.setFilters("stat,wall,log4j");
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        return datasource;
    }
}

