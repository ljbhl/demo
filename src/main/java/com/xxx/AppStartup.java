package com.xxx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AppStartup {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppStartup.class).run(args);
    }

}
