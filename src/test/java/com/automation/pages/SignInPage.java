package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpLink;

    @FindBy(xpath = "//span[contains(text(),'Registration Successful')]")
    WebElement successfulMsg;

    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit")
    WebElement signInBtn;


    public void clickSignUpLink() {
        signUpLink.click();
    }

    public boolean isRegisterSuccessful() {
        return successfulMsg.isDisplayed();
    }

    public void enterUsernameAndPassword(String email, String password) {
        usernameInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }
}
