package com.example;

import org.springframework.stereotype.Service;


@Service
public class UsePropertiesAsConfigurationPropertiesFields {

    private final NoPrefixConfigProps noPrefixConfigProps;
    private final DuplicatedProps1 duplicatedProps1;
    private final DuplicatedProps2 duplicatedProps2;
    private final CustomConfigProps customConfigProps;
    private final CtorConfigProps ctorConfigProps;

    public UsePropertiesAsConfigurationPropertiesFields(NoPrefixConfigProps noPrefixConfigProps, DuplicatedProps1 duplicatedProps1, DuplicatedProps2 duplicatedProps2, CustomConfigProps customConfigProps, CtorConfigProps ctorConfigProps) {
        this.noPrefixConfigProps = noPrefixConfigProps;
        this.duplicatedProps1 = duplicatedProps1;
        this.duplicatedProps2 = duplicatedProps2;
        this.ctorConfigProps = ctorConfigProps;
        this.customConfigProps = customConfigProps;
    }

    public void displayPropeties() {
        System.out.println("====== Propeties as ConfigurationProperties fields getters=====");
        System.out.println(customConfigProps.getSp1());
        System.out.println(customConfigProps.getSp2());
        System.out.println(ctorConfigProps.getProp1());
        System.out.println(ctorConfigProps.getProp2());
        System.out.println(noPrefixConfigProps.getNoPrefixStrProp());
        System.out.println(duplicatedProps1.getDuplicatedProp());
        System.out.println(duplicatedProps1.getSamePrefixUniqueProp1());
        System.out.println(duplicatedProps2.getDuplicatedProp());
        System.out.println(duplicatedProps2.getSamePrefixUniqueProp2());


        System.out.println("===================");
    }

    ;
}
