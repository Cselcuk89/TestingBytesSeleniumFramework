package com.selcuk.testcases;

import com.selcuk.driver.Driver;
import com.selcuk.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest {
    private HomePageTests(){

    }
    @Test
    public void test2(){

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);


    }

}
