package com.selcuk.pages;

import com.selcuk.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage {
    private final By textboxUsername = By.xpath("//input[@name='username']");
    private final By textboxPassword = By.xpath("//input[@name='password']");
    private final By buttonLogin = By.xpath("//button[text()=' Login ']");
    public OrangeHRMLoginPage enterUserName(String username) throws InterruptedException {
        Thread.sleep(3);
        DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
        return this;
    }
    public OrangeHRMLoginPage enterPassword(String password){
        DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
        return this;
    }
    public OrangeHRMHomePage clickLogin(){
        DriverManager.getDriver().findElement(buttonLogin).click();
        return new OrangeHRMHomePage();
    }
    public String getTitle(){
        return DriverManager.getDriver().getTitle();
    }
}
