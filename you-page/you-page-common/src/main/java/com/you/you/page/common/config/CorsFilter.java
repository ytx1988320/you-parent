/**
 * Copyright (C), 2019
 * FileName: CorsFilter
 * Author:   york
 * Date:     2019/4/1 14:39
 */
package com.you.you.page.common.config;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈跨域问题处理〉
 *
 * @author york
 * @create 2019/4/1
 * @since 1.0.0
 */
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest)servletRequest;

        String origin = request.getHeader("Origin");
        if(StringUtils.isNotBlank(origin)){
            response.setHeader("Access-Control-Allow-Origin", origin);
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "token,Origin, X-Requested-With, Content-Type, Accept");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setContentType("application/json; charset=utf-8");
        }
        String method = request.getMethod();
        if(method.equalsIgnoreCase("OPTIONS")){
            servletResponse.getOutputStream().write("Success".getBytes("utf-8"));
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
    @Override
    public void destroy() {
    }
}