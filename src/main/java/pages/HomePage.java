package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.WebDriverInstance;

import java.time.Duration;

public class HomePage {
    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
        By selector = By.xpath("//h1[contains(@class, 'home-title')]");
        return wait
                .until(ExpectedConditions.presenceOfElementLocated(selector))
                .isDisplayed();
    }

    public void clickLoginMenuBtn() {
        By selector = By.xpath("//div[contains(@class, 'menuchild-parent desktop')]//div[contains(@class, 'button-light')]");
        WebElement btn = WebDriverInstance.webDriver.findElement(selector);
        btn.click();
    }

    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(Duration.ofSeconds(seconds).toMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
