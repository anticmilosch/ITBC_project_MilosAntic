package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragDropPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By fromElementLocator = By.cssSelector("#draggable");
    private By toElementLocator = By.cssSelector("#droppable");

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void dragAndDropElement() {
        WebElement fromElement = driver.findElement(fromElementLocator);
        WebElement toElement = driver.findElement(toElementLocator);

        Actions act = new Actions(driver);
        act.dragAndDrop(fromElement, toElement).build().perform();

        wait.until(ExpectedConditions.attributeContains(toElement, "class", "ui-state-highlight"));
    }

    public String getDroppedElementText() {
        WebElement toElement = driver.findElement(toElementLocator);
        return toElement.getText();
    }
}
