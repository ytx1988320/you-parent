package com.you.you.page.server.back.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author follow
 * @ClassName Swagger2
 * @Description Swagger配置类
 * @Date 2018/4/11 22:09
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Value("server.port")
    private String serverPort;
//    @Value("${swagger.enable}")
//    private Boolean SWAGGER_ENABLE;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
//                .enable(true)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.you.you.page.server.back.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("儿童之星项目后台管理接口文档")
                .description("儿童之星项目后台管理接口文档")
                .termsOfServiceUrl("")
                .contact(new Contact("follow","",""))
                .version("1.0")
                .build();
    }
}
