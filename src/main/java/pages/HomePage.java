package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    HomePageElements homePage;

    public HomePage (WebDriver driver) {
        this.driver = driver;
        homePage = new HomePageElements(this.driver);
    }

    public void enterDetailsInSearch(String searchString) {
        homePage.searchField.sendKeys(searchString);
    }
    public void clickSearchButton() {
        homePage.searchButton.click();
    }
    public String getFirstSearchResultTitle() {
        return homePage.firstSearchResultTitle.getText();
    }
}
