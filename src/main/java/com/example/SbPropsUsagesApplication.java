package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
public class SbPropsUsagesApplication  implements CommandLineRunner {


    private final UsePropertiesAsConfigurationPropertiesFields usePropertiesAsConfigurationPropertiesFields;

    public SbPropsUsagesApplication(UsePropertiesAsConfigurationPropertiesFields usePropertiesAsConfigurationPropertiesFields) {
        this.usePropertiesAsConfigurationPropertiesFields = usePropertiesAsConfigurationPropertiesFields;
    }



    public static void main(String[] args) {
        SpringApplication.run(SbPropsUsagesApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        usePropertiesAsConfigurationPropertiesFields.displayPropeties();
    }
}
