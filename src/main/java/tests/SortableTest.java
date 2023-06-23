package tests;

import org.testng.annotations.Test;

import pages.SortablePage;

public class SortableTest extends BaseTest {
    @Test
    public void testElementSwap() {
        driver.get("https://demoqa.com/sortable");
        SortablePage sortablePage = new SortablePage(driver);
        sortablePage.swapElements();
    }
}
