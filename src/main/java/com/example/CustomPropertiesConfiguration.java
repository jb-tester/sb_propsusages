package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomPropertiesConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "my.custom.props")
    public CustomConfigProps myCustomProps1(){
        return new CustomConfigProps();
    };
}
