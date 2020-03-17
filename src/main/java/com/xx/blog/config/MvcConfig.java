package com.xx.blog.config;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xx.blog.conponent.Intercept;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MvcConfig implements WebMvcConfigurer {


    /**
     * 扩展WebMvcConfigurer
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            /**
             * 把地址视图映射写在这里吧，实现重定向
             * @param registry
             */
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addRedirectViewController("main", "index");
            }


            /**
             * 静态资源  写在了yml里面
             */
//            @Override
//            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//            }

            /**
             * 登陆拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //将自己配置的拦截器注册到这里来
                registry.addInterceptor(new Intercept())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/index", "/login", "/","/error", "/static/**");//资源放行

            }
        };


    }

}
