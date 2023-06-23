package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TextBoxPage {
    private WebDriver driver;

    private By emailFieldLocator = By.id("userEmail");
    private By submitButtonLocator = By.id("submit");
    private By emailResultLocator = By.id("email");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys(email);
    }

    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(submitButtonLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).click().perform();
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
    }

    public void verifyEnteredEmail(String expectedEmail) {
        WebElement emailResult = driver.findElement(emailResultLocator);
        String actualEmail = emailResult.getText();
        Assert.assertTrue(actualEmail.contains(expectedEmail), "Email does not match.");
    }
}
