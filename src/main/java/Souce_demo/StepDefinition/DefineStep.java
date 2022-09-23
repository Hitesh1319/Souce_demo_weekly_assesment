package Souce_demo.StepDefinition;

import Souce_demo.Pages.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class DefineStep extends BaseClass {

    By loginButton = By.xpath("//input[@type='submit']");
    @Given("^User is on Login Page$")
    public void User_is_on_Login_page() {
        setup();
    }

    @When("User enter Username and Password")
    public void User_enter_username_and_password() {
        pageFactory.getLoginPage().login();
    }
}
