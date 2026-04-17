package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// Navigation from the property usage
@Service
public class UsePropertiesAsValues {

    @Value("${my.custom.props.sp1}")
    String normal_sp1;
    @Value("${my.custom.props.sp2}")
    String normal_sp2;
    @Value("${myprops.duplicated.duplicated-prop}")
    String duplicatedProp;
    @Value("${myprops.duplicated.same-prefix-unique-prop1}")
    String same_prefix_p1;
    @Value("${myprops.duplicated.same-prefix-unique-prop2}")
    String same_prefix_p2;
    @Value("${no-prefix-str-prop}")
    String no_prefix_p1;
    @Value("${additional.metadata.prop1}")
    String additional_metadata_prop1;
    @Value("${local.prop1}")
    String local_prop1;
    @Value("${local.prop2}")
    String local_prop2;

    @Value("${spring.application.name}")
    String spring_application_name;
    @Value("${spring.main.banner-mode}")
    String banner_mode;
    @Value("${spring.profiles.default}")
    String default_profile;
    @Value("${spring.task.execution.mode}")
    String task_execution_mode;

}
