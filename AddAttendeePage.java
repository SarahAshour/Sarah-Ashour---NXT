package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAttendeePage {
    WebDriver driver;

    // Locators
    By addAttendeeButton = By.id("addGroupeBtn");
    By attendeeNameField = By.id("groupName");
    By submitButton = By.id("save");

    public AddAttendeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddAttendee() {
        driver.findElement(addAttendeeButton).click();
    }

    public void enterAttendeeDetails(String name, String email) {
        driver.findElement(attendeeNameField).sendKeys(name);
    }

    public void submitAttendee() {
        driver.findElement(save).click();
    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddAttendeePage;
import pages.LoginPage;

public class AddAttendeeTest extends BaseTest {

    @Test
    public void addAttendeeTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("nxttester");
        loginPage.enterPassword("nxt#qA@23");
        loginPage.clickLogin();

        AddAttendeePage addAttendeePage = new AddAttendeePage(driver);
        addAttendeePage.clickAddAttendee();
        addAttendeePage.enterAttendeeDetails("John Doe");
        addAttendeePage.submitAttendee();

        // Add assertion for successful addition, such as checking attendee list or confirmation message
    }
}
