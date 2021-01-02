package tests;

import pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends AbstractBaseClass {

    @Test
    public void search_test(){

        String scrItem = "iphone 11 pro";

        HomePage home = new HomePage(driver);

        driver.get("https://www.ebay.com/");

        home.enterDetailsInSearch(scrItem);

        home.clickSearchButton();

        String srcRes1 = home.getFirstSearchResultTitle();
        Assert.assertTrue(
                "Search Key is present in First Search Result",
                srcRes1.toLowerCase().contains(scrItem.toLowerCase()));
    }
}


