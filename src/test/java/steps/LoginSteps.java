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
        loginPage.clickLoginButton();
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

    @Then("User gets warning on username field with the message {string}")
    public void userGetsWarningOnUsernameFieldWithTheMessage(String message) {
        Assert.assertEquals(message, loginPage.getUsernameValidationMessage());
    }

    @Then("User gets warning on password field with the message {string}")
    public void userGetsWarningOnPasswordFieldWithTheMessage(String message) {
        Assert.assertEquals(message, loginPage.getPasswordValidationMessage());
    }

    @Then("Login button is still visible")
    public void loginButtonIsStillVisible() {
        boolean isDisplayed = loginPage.isBtnLoginDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @When("User click login with Facebook button")
    public void userClickLoginWithFacebookButton() {
        loginPage.clickLoginWithFacebookButton();
    }

    @When("User changes to other window")
    public void userChangesToOtherWindow() {
        loginPage.switchToNewlyOpenedWindow();
    }

    @When("User input facebook email {string}")
    public void userInputFacebookEmail(String email) {
        loginPage.inputFacebookEmail(email);
    }

    @When("User input facebook password {string}")
    public void userInputFacebookPassword(String password) {
        loginPage.inputFacebookPassword(password);
    }

    @When("User click facebook login button")
    public void userClickFacebookLoginButton() {
        loginPage.clickFacebookLoginButton();
    }

    @When("User changes back to parent window")
    public void userChangesBackToParentWindow() {
        loginPage.switchToParentWindow();
    }

    @When("User click login with Google button")
    public void userClickLoginWithGoogleButton() {
        loginPage.clickLoginWithGoogleButton();
    }

    @When("User input Google email {string}")
    public void userInputGoogleEmail(String email) {
        loginPage.inputGoogleEmail(email);
    }

    @When("User input Google password {string}")
    public void userInputGooglePassword(String password) {
        loginPage.inputGooglePassword(password);
    }

    @When("User click Google next button")
    public void userClickGoogleNextButton() {
        loginPage.clickGoogleNextButton();
    }
}
