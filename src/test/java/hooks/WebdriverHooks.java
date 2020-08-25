package hooks;

import webdriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//class WebDriverHooks

public class WebdriverHooks {


    @Before(value = "@Web")
    public void initializeWebdriver() {
        WebDriverInstance.startDriver();
    }

    @After(value = "@Web")
    public void quitWebdriver(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario
                    .embed(((TakesScreenshot) WebDriverInstance.webDriver).getScreenshotAs(OutputType.BYTES),
                            "image/png");
            scenario.write("Scenario Fail");
        }
        WebDriverInstance.quit();
    }

}
