package com.google;

import org.junit.Assert;
import org.junit.Test;

public class OpenAndCloseWebPage extends WebDriverSettingsBeforeAfter {

    @Test
    public void firstTest1() {
        driver.get("https://www.google.com/"); //open driver

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
        System.out.println("Test result: title 1 is correct");
    }

    @Test
    public void firstTest2() {
        driver.get("https://www.google.com/"); //open driver

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
        System.out.println("Test result: title 2 is correct");
    }
}
