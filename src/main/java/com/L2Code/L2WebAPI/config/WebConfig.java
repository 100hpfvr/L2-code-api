//package com.L2Code.L2WebAPI.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    private final ContentTypeInterceptor contentTypeInterceptor;
//
//    public WebConfig(ContentTypeInterceptor contentTypeInterceptor) {
//        this.contentTypeInterceptor = contentTypeInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(contentTypeInterceptor)
//                .addPathPatterns("/api/contacts/**");
//    }
//}