package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.WebDriverInstance;

public class LoginPage {
    String xpathInputUsername = "//input[@id='username']";
    String xpathInputPassword = "//input[@id='password']";
    String xpathBtnLogin = "//input[@id='loginbutton']";

    public void inputUsername(String username) {
        By element = By.xpath(xpathInputUsername);
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(username);
    }

    public void inputPassword(String password) {
        By element = By.xpath(xpathInputPassword);
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(password);
    }

    public void clickButtonLogin() {
        By element = By.xpath(xpathBtnLogin);
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

    public String getUsernameValidationMessage() {
        By element = By.xpath(xpathInputUsername);
        return WebDriverInstance.webDriver.findElement(element).getAttribute("validationMessage");
    }

    public String getPasswordValidationMessage() {
        By element = By.xpath(xpathInputPassword);
        return WebDriverInstance.webDriver.findElement(element).getAttribute("validationMessage");
    }

    public boolean isBtnLoginDisplayed() {
        By by = By.xpath(xpathBtnLogin);
        return WebDriverInstance.webDriver.findElement(by).isDisplayed();
    }
}
