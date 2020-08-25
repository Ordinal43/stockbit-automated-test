package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.WebDriverInstance;

public class DashboardPage {
    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
        By selector = By.xpath("//a[@id='homeLink']");
        return wait
                .until(ExpectedConditions.presenceOfElementLocated(selector))
                .isDisplayed();
    }
}
