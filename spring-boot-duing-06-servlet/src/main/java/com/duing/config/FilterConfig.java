package com.duing.config;

import com.duing.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter> registrationBean(){
        FilterRegistrationBean<CustomFilter> filterRegistrationBean =
                new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        //过滤器的优先级 数字越小  优先级越高
        filterRegistrationBean.setOrder(0);
        return filterRegistrationBean;
    }


}
