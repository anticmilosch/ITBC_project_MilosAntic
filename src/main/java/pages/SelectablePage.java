package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePage {
    private WebDriver driver;

    private By elementToSelectLocator = By.cssSelector("#verticalListContainer > li:nth-child(1)");

    public SelectablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectElement() {
        WebElement elementToSelect = driver.findElement(elementToSelectLocator);
        elementToSelect.click();
    }

    public boolean isElementSelected() {
        WebElement element = driver.findElement(elementToSelectLocator);
        String classAttributeValue = element.getAttribute("class");
        return classAttributeValue.contains("active");
    }
}
