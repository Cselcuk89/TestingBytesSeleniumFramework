package com.selcuk.assertJ;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssertJDemo {
    @Test
    public void stringTest(){
        String temp = "Hello World";
        Assertions.assertThat(temp)
                .isNotNull()
                .as("String is actually empty").isNotEmpty()
                .as("String is actually blank").isNotBlank()
                .isEqualTo("Hello World")
                .contains("Hello")
                .doesNotContain("Hi")
                .containsWhitespaces()
                .containsIgnoringCase("world")
                .matches("\\w.*"+" World")
                .doesNotContainPattern("\\d.*")// 0-9 --> does not contain digits
                .hasSize(11)
                .hasSizeGreaterThan(10)
                .hasSizeLessThan(20)
                .hasSizeBetween(10,20)
                .endsWith("World")
                .isInstanceOf(String.class);

    }
    @Test
    public void numbersTest(){
        int a = 10;
        Assertions.assertThat(a)
                .isEqualTo(10)
                .isCloseTo(14, Offset.offset(5))
                .isInstanceOf(Integer.class)
                .isBetween(3,15)
                .isCloseTo(12, Percentage.withPercentage(30))
                .isNotCloseTo(15,Percentage.withPercentage(30))
                .isPositive()
                .isEven()
                .isGreaterThanOrEqualTo(5)
                .isLessThanOrEqualTo(20);
    }
    @Test
    public void listTest(){
        List<String> list = Arrays.asList("Testing","Mini","Bytes");
        List<String> list2 = Arrays.asList("Testing","Mini");
        List<String> list3 = Arrays.asList("Automation","Selenium");
        Assertions.assertThat(list)
                .hasSize(3)
                .hasAtLeastOneElementOfType(String.class)
                .isNotNull()
                .contains("Testing")
                .doesNotContain("Automation")
                .startsWith("Testing")
                .containsExactlyInAnyOrder("Mini","Testing","Bytes")
                .withFailMessage(()->"String is not having size less than 3").allMatch(s->s.length()<3)
                .containsAll(list2)
                .doesNotContainAnyElementsOf(list3);
    }
    @Test
    public void mapTest(){
        Map<String,String> map = new HashMap<>();
        map.put("name","Cagri");
        map.put("channel","Calcfly");
        map.put("game","cricket");
        Assertions.assertThat(map)
                .containsEntry("name","Cagri")
                .hasSize(3)
                .isNotEmpty()
                .doesNotContainEntry("fav","football")
                .doesNotContainKey("Game")
                .containsKey("channel")
                .containsValue("cricket");
    }

}
