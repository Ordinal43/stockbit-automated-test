package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.WebDriverInstance;

import java.util.Set;

public class LoginPage {
    String xpathInputUsername = "//input[@id='username']";
    String xpathInputPassword = "//input[@id='password']";
    String xpathBtnLogin = "//input[@id='loginbutton']";

    String parentWindow = WebDriverInstance.webDriver.getWindowHandle();

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

    public void clickLoginButton() {
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

    public void clickLoginWithGoogleButton() {
        By element = By.xpath("//input[contains(@class, 'login-goog')]");
        WebElement btnLogin = WebDriverInstance.webDriver
                .findElement(element);
        btnLogin.click();
    }

    public void clickLoginWithFacebookButton() {
        By element = By.xpath("//a[contains(@class, 'login-fb')]");
        WebElement btnLogin = WebDriverInstance.webDriver
                .findElement(element);
        btnLogin.click();
    }

    public void switchToNewlyOpenedWindow() {
        Set<String> windows = WebDriverInstance.webDriver.getWindowHandles();
        for (String window : windows)
            WebDriverInstance.webDriver.switchTo().window(window);
    }

    public void inputFacebookEmail(String email) {
        By element = By.xpath("//input[@id='email']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(email);
    }

    public void inputFacebookPassword(String password) {
        By element = By.xpath("//input[@id='pass']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(password);
    }

    public void clickFacebookLoginButton() {
        By element = By.xpath("//input[@value='Log In']");
        WebElement btnLogin = WebDriverInstance.webDriver
                .findElement(element);
        btnLogin.click();
    }

    public void inputGoogleEmail(String email) {
        By element = By.xpath("//input[@id='identifierId']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(email);
    }

    public void clickGoogleNextButton() {
        By element = By.xpath("//span[text()='Next' or text()='Berikutnya']//parent::button");
        WebElement btnLogin = WebDriverInstance.webDriver
                .findElement(element);
        btnLogin.click();
    }

    public void inputGooglePassword(String password) {
        By element = By.xpath("//input[@type='password']");
        WebElement inputPhoneNumber = WebDriverInstance.webDriver
                .findElement(element);
        inputPhoneNumber.sendKeys(password);
    }

    public void switchToParentWindow() {
        WebDriverInstance.webDriver.switchTo().window(parentWindow);
    }
}
