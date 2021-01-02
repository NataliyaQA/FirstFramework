package com.google;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettingsBeforeAfter {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:/7/java/chromedriver_win32/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Test result: site is started");
    }

    @After
    public void close() {
        System.out.println("Test result: site is closed");
        driver.quit();// close driver
    }
}
