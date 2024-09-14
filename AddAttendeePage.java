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
