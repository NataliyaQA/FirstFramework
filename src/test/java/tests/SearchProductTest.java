package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SearchProductTest extends AbstractBaseClass {
    @Test
    public void search_test() {
        String srcItem = "iphone 11 pro";

     System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
     WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(srcItem);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        String srcRes1 =
                driver.findElement(By.xpath("//h3[contains(text(),'Apple iPhone 11 Pro Max - 256GB - Gold A2161 (CDMA')]")).getText();

        Assert.assertTrue("Search Key is present in First Search Result",
                srcRes1.toLowerCase().contains(srcItem.toLowerCase()));
        driver.quit();
    }
}



