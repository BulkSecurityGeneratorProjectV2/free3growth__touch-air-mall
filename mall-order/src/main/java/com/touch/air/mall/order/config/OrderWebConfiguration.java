package com.touch.air.mall.order.config;

import com.touch.air.mall.order.interceptor.LoginUserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 使拦截器生效
 *
 * @author: bin.wang
 * @date: 2021/2/18 14:35
 */
@Configuration
public class OrderWebConfiguration implements WebMvcConfigurer {

    @Resource
    private LoginUserInterceptor loginUserInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginUserInterceptor).addPathPatterns("/**");
    }
}
