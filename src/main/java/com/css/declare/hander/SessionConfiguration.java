package com.css.declare.hander;

/**
 * \* User: rgy
 * \* Date: 2019/8/19 15:40
 * \
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
/**
 * 添加拦截器
 */
public class SessionConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry ){
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/");
        //网站配置生成器：添加一个拦截器，拦截路径为整个项目
    }
}