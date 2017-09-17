package com.xxx;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xxx.filter.SignValidateFilter;
import com.xxx.interceptor.SignInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SignInterceptor()).addPathPatterns("/*");
		super.addInterceptors(registry);
	}
	
	@Bean
    public FilterRegistrationBean signValidateFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        SignValidateFilter signValidateFilter = new SignValidateFilter();
        registration.setFilter(signValidateFilter);
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
}
