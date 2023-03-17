package cydeo.step_definitions;

import cydeo.pages.Login;
import cydeo.pages.QuickLaunchpad;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDefinitions {

    Login login = new Login();
    QuickLaunchpad quickLP = new QuickLaunchpad();

    @When("the user is on the login page")
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
        String expectedText= "Quick Launchpad";
        String actualText= quickLP.quickLaunchpad.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(expectedText);
        System.out.println(actualText);

    }

    @When("the user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {

    }

    @Then("the user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {

    }

    @When("the user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {

    }


}
