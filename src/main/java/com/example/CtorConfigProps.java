package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;


@ConfigurationProperties(prefix = "my.ctor.props")
public class CtorConfigProps {

    String prop1;
    String prop2;
    String prop3;
    String prop4;
    String prop5 ;
    String prop6;

    // gutter for the ctor arguments shows only the usages in application.* files
    // this behavior differs from the setter-based properties - fixed
    public CtorConfigProps(String prop1, String prop2, String prop3, String prop4, @DefaultValue("default value for not set property") String prop5, String prop6) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
        this.prop5 = prop5;
        this.prop6 = prop6;
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

    public String getProp5() {
        return prop5;
    }

    public String getProp6() {
        return prop6;
    }
}
