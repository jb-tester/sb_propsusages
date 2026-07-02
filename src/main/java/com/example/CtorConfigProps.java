package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.ctor.props")
public class CtorConfigProps {

    String prop1;
    String prop2;
    String prop3;
    String prop4;

    // gutter for the ctor arguments shows only the usages in application.* files
    // this behavior differs from the setter-based properties - fixed
    public CtorConfigProps(String prop1, String prop2, String prop3, String prop4) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public String getProp3() {
        return prop3;
    }

    public String getProp4() {
        return prop4;
    }
}
