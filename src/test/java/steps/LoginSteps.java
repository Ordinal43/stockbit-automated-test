package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on Stockbit home screen")
    public void userIsOnStockbitHomeScreen() {
        boolean isOnPage = homePage.isOnPage();
        Assert.assertTrue(isOnPage);
    }

    @When("User click login menu button")
    public void userClickLoginMenuButton() {
        homePage.clickLoginMenuBtn();
    }


    @When("User wait for {int} seconds")
    public void userWaitForSeconds(int seconds) {
        homePage.waitSeconds(seconds);
    }

    @When("User input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("User input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("User click login button")
    public void userClickLoginButton() {
        loginPage.clickButtonLogin();
    }

    @Then("User is on Stockbit dashboard page")
    public void userIsOnStockbitHomePage() {
        boolean isOnPage = dashboardPage.isOnPage();
        Assert.assertTrue(isOnPage);
    }

    @Then("User gets error with the message {string}")
    public void userGetsErrorWithTheMessage(String message) {
        Assert.assertEquals(message, loginPage.getMessage());
    }
}
