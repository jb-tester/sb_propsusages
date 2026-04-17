package com.example;

import org.springframework.stereotype.Service;


@Service
public class UsePropertiesAsConfigurationPropertiesFields {

    private final NoPrefixConfigProps noPrefixConfigProps;
    private final DuplicatedProps1 duplicatedProps1;
    private final DuplicatedProps2 duplicatedProps2;
    private final CustomProps1 customProps1;

    public UsePropertiesAsConfigurationPropertiesFields(NoPrefixConfigProps noPrefixConfigProps, DuplicatedProps1 duplicatedProps1, DuplicatedProps2 duplicatedProps2, CustomProps1 customProps1) {
        this.noPrefixConfigProps = noPrefixConfigProps;
        this.duplicatedProps1 = duplicatedProps1;
        this.duplicatedProps2 = duplicatedProps2;
        this.customProps1 = customProps1;
    }

    public void displayPropeties() {
        System.out.println("====== Propeties as ConfigurationProperties fields getters=====");
        System.out.println(customProps1.getSp1());
        System.out.println(customProps1.getSp2());
        System.out.println(noPrefixConfigProps.getNoPrefixStrProp());
        System.out.println(duplicatedProps1.getDuplicatedProp());
        System.out.println(duplicatedProps1.getSamePrefixUniqueProp1());
        System.out.println(duplicatedProps2.getDuplicatedProp());
        System.out.println(duplicatedProps2.getSamePrefixUniqueProp2());


        System.out.println("===================");
    }

    ;
}
