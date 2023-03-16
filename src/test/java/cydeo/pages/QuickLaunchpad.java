package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpad extends BasePage{

    public QuickLaunchpad(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchpad;
}
