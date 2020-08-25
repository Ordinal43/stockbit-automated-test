package webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebDriverInstance {

    public static WebDriver webDriver;

    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();

        // ======= Set ChromeOptions =======
        options.addArguments("--incognito", "--start-maximized");
        // Set desired capabilities
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        // Instantiate webdriver
        webDriver = new ChromeDriver(options);
        // Maximize (doesn't work on Mac)
        webDriver.manage().window().maximize();
        // Set implicit wait
        webDriver.manage().timeouts()
                .implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://stockbit.com");
    }

    public static void quit() {
        webDriver.quit();
    }

}
