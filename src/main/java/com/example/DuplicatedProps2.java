package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "myprops.duplicated")
public class DuplicatedProps2 {
    String strProp;

    public String getStrProp() {
        return strProp;
    }

    public void setStrProp(String noPrefixStrPropArg) {
        strProp = noPrefixStrPropArg;
    }
}
