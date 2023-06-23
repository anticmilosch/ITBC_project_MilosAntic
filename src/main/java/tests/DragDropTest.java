package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.DragDropPage;

public class DragDropTest extends BaseTest {
    @Test
    public void testDragAndDrop() {
        driver.get("https://demoqa.com/droppable");
        DragDropPage dragDropPage = new DragDropPage(driver);
        dragDropPage.dragAndDropElement();

        String actualText = dragDropPage.getDroppedElementText();
        String expectedText = "Dropped!";

        Assert.assertEquals(actualText, expectedText, "Element was not dropped successfully.");
    }
}
