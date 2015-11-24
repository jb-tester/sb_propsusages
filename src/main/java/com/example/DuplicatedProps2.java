package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/28/2015.
 * Project: yamlTest
 * *******************************
 */
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
