package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties
public class NoPrefixConfigProps {
    String noPrefixStrProp;

    public String getNoPrefixStrProp() {
        return noPrefixStrProp;
    }

    public void setNoPrefixStrProp(String noPrefixStrPropArg) {
        noPrefixStrProp = noPrefixStrPropArg;
    }
}
