package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.SelectablePage;

public class SelectableTest extends BaseTest {
    @Test
    public void testElementSelection() {
        driver.get("https://demoqa.com/selectable");
        SelectablePage selectablePage = new SelectablePage(driver);
        boolean isElementSelected = selectablePage.isElementSelected();
        Assert.assertFalse(isElementSelected, "Element is already selected.");

        selectablePage.selectElement();

        isElementSelected = selectablePage.isElementSelected();
        Assert.assertTrue(isElementSelected, "Element is not selected after click.");
    }
}
