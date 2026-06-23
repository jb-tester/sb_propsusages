package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "myprops.duplicated")
public class DuplicatedProps1 {
    String duplicatedProp;

    String samePrefixUniqueProp1;

    public String getDuplicatedProp() {
        return duplicatedProp;
    }

    public void setDuplicatedProp(String duplicatedProp) {
        this.duplicatedProp = duplicatedProp;
    }

    public String getSamePrefixUniqueProp1() {
        return samePrefixUniqueProp1;
    }

    public void setSamePrefixUniqueProp1(String samePrefixUniqueProp1) {
        this.samePrefixUniqueProp1 = samePrefixUniqueProp1;
    }
}
