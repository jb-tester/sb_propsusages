package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UsePropertiesInConditions {

    @Bean
    @ConditionalOnProperty("my.ctor.props.prop1")
    public SomeBean someBean0() {
        return new SomeBean("conditional bean depending on my.ctor.props.prop1");
    }

    @Bean
    @ConditionalOnProperty("my.custom.props.sp1")
    public SomeBean someBean1() {
        return new SomeBean("conditional bean depending on my.custom.props.sp1");
    }

    // navigates to property in the @ConfigurationProperties class, but
    // no back navigation is possible
    @Bean
    @ConditionalOnProperty(prefix = "my.custom.props", name = "sp2")
    public SomeBean someBean2() {
        return new SomeBean("conditional bean depending on my.custom.props.sp2");
    }

    @Bean
    @ConditionalOnProperty("myprops.duplicated.duplicated-prop")
    public SomeBean someBean3() {
        return new SomeBean("conditional bean depending on myprops.duplicated.duplicated-prop");
    }

    @Bean
    @ConditionalOnProperty("myprops.duplicated.same-prefix-unique-prop1")
    public SomeBean someBean4() {
        return new SomeBean("conditional bean depending on myprops.duplicated.same-prefix-unique-prop1");
    }

    @Bean
    @ConditionalOnProperty("myprops.duplicated.same-prefix-unique-prop2")
    public SomeBean someBean5() {
        return new SomeBean("conditional bean depending on myprops.duplicated.same-prefix-unique-prop2");
    }

    @Bean
    @ConditionalOnProperty("no-prefix-str-prop")
    public SomeBean someBean6() {
        return new SomeBean("conditional bean depending on no-prefix-str-prop");
    }

    @Bean
    @ConditionalOnProperty("additional.metadata.prop1")
    public SomeBean someBean7() {
        return new SomeBean("conditional bean depending on additional.metadata.prop1");
    }

    @Bean
    @ConditionalOnProperty("local.prop1")
    public SomeBean someBean8() {
        return new SomeBean("conditional bean depending on local.prop1");
    }
}
