package com.selcuk.testcases;

import com.selcuk.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected BaseTest(){

    }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();

    }
    @AfterMethod
    protected void tearDown(){
        Driver.quitDriver();
    }
}
