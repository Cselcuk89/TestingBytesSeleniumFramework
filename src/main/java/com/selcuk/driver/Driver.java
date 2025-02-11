package com.selcuk.driver;
import com.selcuk.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;


public final class Driver {
    private Driver(){

    }

    public static void initDriver() throws Exception {
        // checking if driver instance is null or not
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }
    // checking if driver instance is null or not
    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }

    }
}
