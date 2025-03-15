package com.selcuk.pages;

import com.selcuk.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMHomePage {
    private final By linkWelcome = By.xpath("//li[@class='oxd-userdropdown']/descendant::i");
    private final By linklogout = By.xpath("//a[text()='Logout']");
    public OrangeHRMHomePage clickWelcome(){
        DriverManager.getDriver().findElement(linkWelcome).click();
        return this;
    }
    public OrangeHRMLoginPage clickLogout(){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(linklogout));
        DriverManager.getDriver().findElement(linklogout).click();
        return new OrangeHRMLoginPage();
    }


}
