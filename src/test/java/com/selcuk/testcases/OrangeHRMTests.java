package com.selcuk.testcases;

import com.selcuk.driver.DriverManager;
import com.selcuk.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.time.Duration;

public final class OrangeHRMTests extends  BaseTest{
    private OrangeHRMTests() {
    }
    @Test
    public void loginLogoutTest() throws InterruptedException {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String title = new OrangeHRMLoginPage().
                      enterUserName("Admin").enterPassword("admin123")
                      .clickLogin().clickWelcome().clickLogout().getTitle();
        Assertions.assertThat(title).isEqualTo("OrangeHRM");

    }
}
