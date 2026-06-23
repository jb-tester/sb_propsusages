package com.example;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class UsePropertiesFromEnvironment {


    private final Environment environment;

    public UsePropertiesFromEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void getAllProperties() {
        System.out.println("====== from environment =====");
        System.out.println(environment.getProperty("no-prefix-str-prop"));
        System.out.println(environment.getProperty("myprops.duplicated.duplicated-prop"));
        System.out.println(environment.getProperty("myprops.duplicated.same-prefix-unique-prop1"));
        System.out.println(environment.getProperty("myprops.duplicated.same-prefix-unique-prop2"));
        System.out.println(environment.getProperty("my.custom.props.sp1"));
        System.out.println(environment.getProperty("my.custom.props.sp2"));
        System.out.println(environment.getProperty("my.ctor.props.prop1"));
        System.out.println(environment.getProperty("my.ctor.props.prop2"));
        System.out.println(environment.getProperty("additional.metadata.prop1"));
        System.out.println(environment.getProperty("local.prop1"));
        System.out.println(environment.getProperty("spring.application.name"));
        System.out.println(environment.getProperty("spring.task.execution.mode"));
        System.out.println(environment.getProperty("spring.profiles.default"));
        System.out.println(environment.getProperty("spring.main.banner-mode"));
        System.out.println("===================");
    }

    ;
}
