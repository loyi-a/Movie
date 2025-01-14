package org.seiryo.movie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Description TODO
 * @Author 罗伊
 * @Date 9/1/2025
 */
//拦截器注解
@Configuration
public class FilterConfig extends WebMvcConfigurationSupport {

    //单例模式运行自定义
    @Bean
    public MyFilter init(){
        return new MyFilter();
    }

    //WebMvcConfigurationSupport 属于WEB/MVC的专属过滤器
    //配置过滤器路径
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(init()).
                addPathPatterns("/**").
                excludePathPatterns("/static/**").
                excludePathPatterns("/templates/**");
    }

    //配置静态资源映射路径
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").
                addResourceLocations("classpath:/static/").
                addResourceLocations("classpath:/templates/");
    }
}
