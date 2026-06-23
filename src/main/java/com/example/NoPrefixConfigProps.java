package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties
public class NoPrefixConfigProps {
    String noPrefixStrProp;

    public String getNoPrefixStrProp() {
        return noPrefixStrProp;
    }

    // incorrect representation for property name in the popup title (`.noPrefixStrProp`)
    public void setNoPrefixStrProp(String noPrefixStrPropArg) {
        noPrefixStrProp = noPrefixStrPropArg;
    }
}
