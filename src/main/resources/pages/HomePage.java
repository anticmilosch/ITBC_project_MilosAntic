package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By bannerImageLocator = By.cssSelector("#app > div > div > div.home-banner > a > img");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBannerImage() {
        WebElement bannerImage = driver.findElement(bannerImageLocator);
        bannerImage.click();
    }
}
