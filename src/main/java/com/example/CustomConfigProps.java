package com.example;

import org.springframework.boot.context.properties.bind.DefaultValue;

// navigation via setter method gutters navigates to all usages of the property
// Problems:
// - no sorting by categories - fixed
// - inconsistent representation for application.properties vs application.yaml - fixed
// - inconsistent representation for usages in placeholders in all places vs in application.*
public class CustomConfigProps {
    String sp1;
    String sp2;
    String sp3;
    String sp4;

    String sp5 = "default value for not set property";

    public String getSp5() {
        return sp5;
    }

    public void setSp5(String sp5) {
        this.sp5 = sp5;
    }

    public String getSp4() {
        return sp4;
    }

    public void setSp4(String sp4) {
        this.sp4 = sp4;
    }

    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    public String getSp2() {
        return sp2;
    }

    public String getSp1() {
        return sp1;
    }

}
