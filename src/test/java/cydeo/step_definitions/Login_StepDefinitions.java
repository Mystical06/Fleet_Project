package cydeo.step_definitions;

import cydeo.pages.Login;
import cydeo.pages.LandingPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Login_StepDefinitions {

    Login login = new Login();
    LandingPage landingPage = new LandingPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
    }

    @When("the user logs in as a driver")
    public void the_user_logs_in_as_a_driver() {
        login.inputUsername.sendKeys(ConfigurationReader.getProperty("driver.username"));
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        login.logInButton.click();

    }


    @Then("the user is on the Quick Launchpad")
    public void the_user_is_on_the_quick_launchpad() throws InterruptedException {
        Thread.sleep(2000);
        String expectedQLaunchpadTExt= "Quick Launchpad";
        String actualQLaunchpadTextText= landingPage.quickLaunchpad.getText();
        Assert.assertEquals(expectedQLaunchpadTExt,actualQLaunchpadTextText);


    }

    @When("the user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {
        login.inputUsername.sendKeys(ConfigurationReader.getProperty("salesmanager.username"));
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        login.logInButton.click();

    }

    @Then("the user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() throws InterruptedException {
        Thread.sleep(2000);
        String expectedDashboardText= "Dashboard";
        String actualDashboardText= landingPage.dashboard.getText();
        Assert.assertEquals(expectedDashboardText,actualDashboardText);

    }

    @When("the user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {
        login.inputUsername.sendKeys(ConfigurationReader.getProperty("storemanager.username"));
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        login.logInButton.click();

    }






    @When("the user enters invalid username and password")
    public void the_user_enters_invalid_username_and_password() {
        login.inputUsername.sendKeys(ConfigurationReader.getProperty("invalid.username"));
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("invalid.pw"));
        login.logInButton.click();
    }
    @Then("the user sees 'Invalid username or password'")
    public void the_user_sees_invalid_username_or_password() {
        login.invalidUNorPW.isDisplayed();
    }


    @When("the user leaves the username or password field empty")
    public void the_user_leaves_the_username_or_password_field_empty() {
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        login.logInButton.click();


    }
    @Then("the user sees 'Please fill out this field' warning message")
    public void the_user_sees_warning_message() {
        String expectedMessage= "Please fill in this field.";
        String actualMessage= login.inputUsername.getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("the user leaves both username and password fields empty and clicks on login button")
    public void the_user_leaves_both_username_and_password_fields_empty_and_clicks_on_login_button() {
        login.logInButton.click();
    }
    @Then("the user sees 'Please fill out this field' warning message only in the username field")
    public void the_user_sees_warning_message_only_in_the_username_field()  {
        String expectedMessage2= "Please fill in this field.";
        String actualMessage2= login.inputUsername.getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage2,actualMessage2);
    }

    @Then("the user sees their own username in the profile menu")
    public void the_user_sees_their_own_username_in_the_profile_menu() throws InterruptedException {
        Thread.sleep(3000);
        String expectedProfileName= ConfigurationReader.getProperty("driver.username");
        String actualProfileName= landingPage.userProfile.getAttribute("text").trim();
        Assert.assertEquals(expectedProfileName,actualProfileName);

    }

    @Then("the sales manager sees their own username in the profile menu")
    public void the_sales_manager_sees_their_own_username_in_the_profile_menu() throws InterruptedException {
        Thread.sleep(3000);
        String expectedProfileName= ConfigurationReader.getProperty("salesmanager.username");
        String actualProfileName= landingPage.userProfile.getAttribute("text").trim();
        Assert.assertEquals(expectedProfileName,actualProfileName);
    }
    @Then("the store manager sees their own username in the profile menu")
    public void the_store_manager_sees_their_own_username_in_the_profile_menu() throws InterruptedException {
        Thread.sleep(3000);
        String expectedProfileName= ConfigurationReader.getProperty("storemanager.username");
        String actualProfileName= landingPage.userProfile.getAttribute("text").trim();
        Assert.assertEquals(expectedProfileName,actualProfileName);
    }



















}
