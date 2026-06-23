package com.example;

// navigation via setter method gutters navigates to all usages of the property
// Problems:
// - no sorting by categories - fixed
// - inconsistent representation for application.properties vs application.yaml - fixed
// - inconsistent representation for usages in placeholders in all places vs in application.*
public class CustomConfigProps {
    String sp1;
    String sp2;

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
