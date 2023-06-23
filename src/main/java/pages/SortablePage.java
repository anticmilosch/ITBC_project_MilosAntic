package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SortablePage {
    private WebDriver driver;

    private By fromElementLocator = By.cssSelector("#demo-tabpane-list > div > div:nth-child(1)");
    private By toElementLocator = By.cssSelector("#demo-tabpane-list > div > div:nth-child(2)");

    public SortablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void swapElements() {
        WebElement fromElement = driver.findElement(fromElementLocator);
        WebElement toElement = driver.findElement(toElementLocator);

        String fromTextBeforeSwap = fromElement.getText();
        String toTextBeforeSwap = toElement.getText();

        Actions act = new Actions(driver);
        act.dragAndDrop(fromElement, toElement).build().perform();

        String fromTextAfterSwap = fromElement.getText();
        String toTextAfterSwap = toElement.getText();

        Assert.assertEquals(fromTextAfterSwap, toTextBeforeSwap);
        Assert.assertEquals(toTextAfterSwap, fromTextBeforeSwap);
    }
}
