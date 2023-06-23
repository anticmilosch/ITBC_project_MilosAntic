package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.HomePage;

public class PageLoadTest extends BaseTest {
    @Test
    public void testOpenToolsQA() {
        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickBannerImage();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://demoqa.com/", "ToolsQA page did not open successfully.");
    }
}
