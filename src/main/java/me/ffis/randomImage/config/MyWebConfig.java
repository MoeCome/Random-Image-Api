package me.ffis.randomImage.config;

import me.ffis.randomImage.interceptor.DomainInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 * Created by fanfan on 2020/01/07.
 */

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DomainInterceptor())
                .addPathPatterns("/random/**") //拦截哪些请求
                .addPathPatterns("/today/**")
                .excludePathPatterns(""); //对哪些请求不拦截
    }
}
