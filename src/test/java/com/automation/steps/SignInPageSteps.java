package com.automation.steps;

import com.automation.pages.SignInPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignInPageSteps {

    SignInPage signInPage = new SignInPage();


    @When("user clicks on signUp link")
    public void user_clicks_on_sign_up_link() {
        signInPage.clickSignUpLink();
    }


    @Then("verify user is registered successfully")
    public void verify_user_is_registered_successfully() {
        Assert.assertTrue(signInPage.isRegisterSuccessful());
    }

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String email, String password) {
        signInPage.enterUsernameAndPassword(ConfigReader.getConfigValue(email), ConfigReader.getConfigValue(password));
    }

    @And("clicks on signIn button")
    public void clicksOnSignInButton() {
        signInPage.clickSignInBtn();
    }

    @Then("verify signIn page is displayed")
    public void verifySignInPageIsDisplayed() {
        Assert.assertTrue(signInPage.isSignInPageDisplayed());
    }
}
