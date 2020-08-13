package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;

public class Login extends Utils {

    private By _enterLoginID = By.id("i0116");
    private By _clickNextButton = By.id("idSIButton9");
    private By _enterPassword = By.id("i0118");
    private By _signInButton = By.id("idSIButton9");

    public void enterLoginId(String username) {
        waitForElementToBevisible(_enterLoginID, 20);
        enterText(_enterLoginID, (username));
    }

    public void clickNextButton(){
        ClickOnElement(_clickNextButton);
    }

    public void enterPassword(String password) {
        waitForElementToBevisible(_enterPassword, 20);
        enterText(_enterPassword, (password));
    }

    public void signInButton() {
        ClickOnElement(_signInButton);
    }

}