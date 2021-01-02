package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    WebDriver driver;

        @FindBy(xpath="//input[@id='gh-ac']") public WebElement searchField;
        @FindBy(xpath="//input[@id='gh-btn']") public WebElement searchButton;
        @FindBy(xpath="//h3[contains(text(),'Apple iPhone 11 Pro Max - 256GB - Gold A2161 (CDMA')]")
        public WebElement firstSearchResultTitle;

        public HomePageElements (WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
                }
}

