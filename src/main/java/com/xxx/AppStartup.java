package com.xxx;

import com.xxx.filter.SignValidateFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppStartup {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppStartup.class).run(args);
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
