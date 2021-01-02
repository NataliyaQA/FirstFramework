package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends AbstractBaseClass {

    @Test
    public void testSearchDoubleTest() {
        String srcItem = "iphone 11 pro";

        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(srcItem);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        String srcRes1 = driver.findElement(
                By.xpath("//h3[contains(text(),'Apple iPhone 11 Pro Max - 256GB - Gold A2161 (CDMA')]")).getText();

        Assert.assertTrue(srcRes1.toLowerCase().contains(srcItem.toLowerCase()),
                "Search Key is present in First Search Result");
    }

}



