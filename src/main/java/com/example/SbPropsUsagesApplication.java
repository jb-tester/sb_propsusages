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

    @Autowired
    private NoPrefixConfigProps noPrefixConfigProps;

    @Autowired
    private DuplicatedProps1 props1;
    @Autowired
    private Environment environment;

    @Bean
    @ConfigurationProperties(prefix = "my.custom.props")
    public CustomProps1 myCustomProps1(){
        return new CustomProps1();
    };

    public static void main(String[] args) {
        SpringApplication.run(SbPropsUsagesApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("=======================================");
        System.out.println(noPrefixConfigProps.getNoPrefixStrProp());
        System.out.println(props1.getStrProp());
        System.out.println(environment.getProperty("my.custom.props.sp1"));
        System.out.println("=======================================");
    }
}
