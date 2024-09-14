package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    // Locators
    By dashboardTitle = By.xpath("//h1[contains(text(),'Dashboard')]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getDashboardTitle() {
        return driver.findElement(dashboardTitle).getText();
    }

    public boolean verifyDashboardPage() {
        return driver.findElement(dashboardTitle).isDisplayed();
    }
}
