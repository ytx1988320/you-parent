package com.you.you.page.server.back.generator.mybatis;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yvan
 * @title 修正MBG生成xml文件时没有覆盖的bug
 * @date 2018/1/20
 */
public class TableMyBatis3Impl extends IntrospectedTableMyBatis3Impl {

    public List<GeneratedXmlFile> getGeneratedXmlFiles() {
        List<GeneratedXmlFile> answer = new ArrayList();
        if (this.xmlMapperGenerator != null) {
            Document document = this.xmlMapperGenerator.getDocument();
            String mergeable = this.context.getProperties().getProperty("mergeable", "false");

            GeneratedXmlFile gxf = new GeneratedXmlFile(
                    document, this.getMyBatis3XmlMapperFileName(), this.getMyBatis3XmlMapperPackage(),
                    this.context.getSqlMapGeneratorConfiguration().getTargetProject(),
                    Boolean.parseBoolean(mergeable), this.context.getXmlFormatter()
            );
            if (this.context.getPlugins().sqlMapGenerated(gxf, this)) {
                answer.add(gxf);
            }
        }

        return answer;
    }
}
