package org.example;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepDef extends BasePage {

    Login login = new Login();

    @When("^I enter Username as \"([^\"]*)\"$")
    public void i_enter_Username_as(String username) {
        login.enterLoginId(username);
    }

    @When("^I click on Next button$")
    public void i_click_on_Next_button() {
        login.clickNextButton();
    }

    @When("^I enter Password \"([^\"]*)\"$")
    public void i_enter_Password(String password) {
        login.enterPassword(password);
    }

    @When("^I click on Next Button$")
    public void i_click_on_Next_Button() {
        login.signInButton();
    }

    @Then("^i am not able to login successfully with Message \"([^\"]*)\"$")
    public void i_am_not_able_to_login_successfully_with_Message(String errorrmessage) {
        Assert.assertEquals(driver.findElement(By.id("passwordError")).getText(),errorrmessage);

    }

}
