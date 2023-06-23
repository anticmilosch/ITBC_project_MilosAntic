package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {
    @Test
    public void testEmailField() {
        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        textBoxPage.enterEmail(email);
        textBoxPage.scrollToElement();
        textBoxPage.clickSubmitButton();
        textBoxPage.verifyEnteredEmail(email);
    }
}
