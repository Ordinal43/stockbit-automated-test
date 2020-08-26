package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.WebDriverInstance;

public class LoginPage {
    public void inputUsername(String username) {
        By element = By.xpath("//input[@id='username']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(username);
    }

    public void inputPassword(String password) {
        By element = By.xpath("//input[@id='password']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(password);
    }

    public void clickButtonLogin() {
        By element = By.xpath("//input[@id='loginbutton']");
        WebElement btnLogin = WebDriverInstance.webDriver
                .findElement(element);
        btnLogin.click();
    }

    public String getMessage() {
        try {
            By element = By.xpath("//div[contains(@class, 'sysmsg alert-top')]");
            return WebDriverInstance.webDriver.findElement(element).getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
