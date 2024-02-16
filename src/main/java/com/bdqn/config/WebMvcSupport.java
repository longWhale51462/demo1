package com.bdqn.config;

import org.omg.PortableInterceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //静态资源不访问控制器转而访问项目路径
        registry.addResourceHandler("/js/**")
                .addResourceLocations("/js/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("/css/");
        registry.addResourceHandler("/img/**")
                .addResourceLocations("/img/");
        registry.addResourceHandler("/pages/**")
                .addResourceLocations("/pages/");
    }

    //配置拦截器
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor().addPathPatterns()
//    }
}
