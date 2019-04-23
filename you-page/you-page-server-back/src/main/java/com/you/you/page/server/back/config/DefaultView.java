/**
 * Copyright (C), 2019
 * FileName: DefaultView
 * Author:   york
 * Date:     2019/3/15 17:54
 */
package com.you.you.page.server.back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈欢迎页控制〉
 *
 * @author york
 * @create 2019/3/15
 * @since 1.0.0
 */
@Configuration
public class DefaultView implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // login页面在 templates 文件夹下
        registry.addViewController("/").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

}