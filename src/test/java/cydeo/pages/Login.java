package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="prependedInput")
    public WebElement inputUsername;

    @FindBy (id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement logInButton;



    @FindBy(xpath = "//a[class='dropdown-toggle']")
    public WebElement displayedUserName;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[1]/div")
    public WebElement invalidUNorPW;

    @FindBy(xpath = "//h2")
    public WebElement loginPage;
















}

