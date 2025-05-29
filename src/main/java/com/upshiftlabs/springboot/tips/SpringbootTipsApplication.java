package com.upshiftlabs.springboot.tips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties(AppConfigProperties.class)
public class SpringbootTipsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTipsApplication.class, args);
    }
}
