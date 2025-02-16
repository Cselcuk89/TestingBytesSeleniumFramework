package com.selcuk.assertJ;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class AssertJSoftAssertion {
    @Test
    public void assertSoftlyTest(){
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat("Hello World")
                .isNotEmpty()
                .hasSize(11)
                .contains("Hello");
        softAssertions.assertAll();
    }
}
