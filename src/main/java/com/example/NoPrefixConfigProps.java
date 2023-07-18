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
@ConfigurationProperties
public class NoPrefixConfigProps {
    String noPrefixStrProp;

    public String getNoPrefixStrProp() {
        return noPrefixStrProp;
    }

    // no navigation to application.properties; setter is shown as not used
    public void setNoPrefixStrProp(String noPrefixStrPropArg) {
        noPrefixStrProp = noPrefixStrPropArg;
    }
}
