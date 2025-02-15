package com.selcuk.testcases;


import com.selcuk.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

import static org.testng.Assert.assertTrue;

public final class HomePageTests extends BaseTest {
    /*
    *validate whether the title is containing Google Search or google search
    * validate whether the title is not null and the length of title is greater that 15 and less than 100
    * check for the links in the pages --> Testing mini bytes - Youtube
    * number of links displayed is exactly 10 or 15
     */
    private HomePageTests(){

    }
    @Test
    public void test2() throws InterruptedException {

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium automation", Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();
        System.out.println(title);
        Assert.assertTrue(Objects.nonNull(title),"Title is null");
        Thread.sleep(5);
        Assert.assertTrue(title.toLowerCase().contains("google search"));
        assertTrue(title.length() > 30);
        assertTrue(title.length() < 100);
        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
        Assert.assertEquals(elements.size(),10);
        boolean isElementPresent = false;
        for (WebElement element:elements) {
            if (element.getText().equalsIgnoreCase("Testing mini bytes - Youtube")) {
                isElementPresent = true;
                break;
            }
        }
        assertTrue(isElementPresent,"Testing mini bytes not found");





    }

}
