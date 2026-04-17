package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"my.custom.props.sp1=test1",
		"my.custom.props.sp2=test2",
		"no-prefix-str-prop=test3",
		"myprops.duplicated.duplicated-prop=test4",
		"myprops.duplicated.same-prefix-unique-prop1=test5",
		"myprops.duplicated.same-prefix-unique-prop2=test6",
		"additional.metadata.prop1=test7",
		"test.local.prop4=${local.prop1}"
})
public class SbPropsUsagesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
