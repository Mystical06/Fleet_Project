package cydeo.step_definitions;


import cydeo.pages.LandingPage;
import cydeo.pages.Login;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    Login login = new Login();
    LandingPage landingPage = new LandingPage();


    @Then("the user logs out using the logout button inside the profile info")
    public void the_user_logs_out_using_the_logout_button_inside_the_profile_info()  {
        landingPage.userProfile.click();
        landingPage.logoutButton.click();

    }
    @Then("the user ends up on the login page")
    public void the_user_ends_up_on_the_login_page() {
        String expectedLoginPage = "Login";
        String actualLoginPage = login.loginPage.getText();
        Assert.assertEquals(expectedLoginPage,actualLoginPage);
    }
    @When("the user clicks step back button")
    public void the_user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("the user is still on the login page")
    public void the_user_is_still_on_the_login_page() {
        String expectedLoginPage = "Login";
        String actualLoginPage = login.loginPage.getText();
        Assert.assertEquals(expectedLoginPage,actualLoginPage);
    }


















}

