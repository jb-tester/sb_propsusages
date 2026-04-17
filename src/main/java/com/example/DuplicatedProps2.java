package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "myprops.duplicated")
public class DuplicatedProps2 {
    String duplicatedProp;

    String samePrefixUniqueProp2;

    public String getDuplicatedProp() {
        return duplicatedProp;
    }

    public void setDuplicatedProp(String duplicatedProp) {
        this.duplicatedProp = duplicatedProp;
    }

    public String getSamePrefixUniqueProp2() {
        return samePrefixUniqueProp2;
    }

    public void setSamePrefixUniqueProp2(String samePrefixUniqueProp2) {
        this.samePrefixUniqueProp2 = samePrefixUniqueProp2;
    }
}
