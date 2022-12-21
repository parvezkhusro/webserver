package com.parvezkhusro.webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.parvezkhusro"})
public class WebserverApplication {
    private static final Logger log = LoggerFactory.getLogger(WebserverApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebserverApplication.class, args);
    }
}
