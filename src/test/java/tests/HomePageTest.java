package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class HomePageTest extends AbstractBaseClass {

    @Test
    public void testSearch() {
        String searchItem = "iphone 11 pro";

        driver.get("https://www.ebay.com/");

        HomePage home = new HomePage(driver);
        home.enterDetailsInSearch(searchItem);
        home.clickSearchButton();

        String firstSearchResultTitle = home.getFirstSearchResultTitle();
        Assert.assertTrue(firstSearchResultTitle.toLowerCase().contains(searchItem.toLowerCase()),
                "Search Key is present in First Search Result");
    }
}


