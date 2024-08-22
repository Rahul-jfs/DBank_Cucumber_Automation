package com.automation.steps;

import com.automation.pages.SignUpPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignUpPageSteps {
    
    SignUpPage signUpPage = new SignUpPage();


    @Given("user opens website")
    public void user_opens_website() {
        signUpPage. openWebsite();
    }

    @Then("verify user signUp page is displayed")
    public void verify_user_sign_up_page_is_displayed() {
        Assert.assertTrue(signUpPage.isSignUpPageDisplayed());
    }

    @When("user enters signUp details")
    public void user_enters_sign_up_details() {
        signUpPage.enterSignUpCredentials(
                ConfigReader.getConfigValue("title"),
                ConfigReader.getConfigValue("firstname"),
                ConfigReader.getConfigValue("lastname"),
                ConfigReader.getConfigValue("Gender"),
                ConfigReader.getConfigValue("dob"),
                ConfigReader.getConfigValue("ssn"),
                ConfigReader.getConfigValue("email"),
                ConfigReader.getConfigValue("password"),
                ConfigReader.getConfigValue("confirmPassword")
        );
    }

    @When("clicks on next button")
    public void clicks_on_next_button() {
        signUpPage.clickNextBtn();
    }


    @Then("verify next signUp page is displayed")
    public void verify_next_sign_up_page_is_displayed() {
        Assert.assertTrue(signUpPage.isNextSignUpPageDisplayed());
    }

    @When("user enters other details")
    public void user_enters_other_details() {
        signUpPage.enterOtherDetails(
                ConfigReader.getConfigValue("address"),
                ConfigReader.getConfigValue("locality"),
                ConfigReader.getConfigValue("region"),
                ConfigReader.getConfigValue("postalCode"),
                ConfigReader.getConfigValue("country"),
                ConfigReader.getConfigValue("homePhone"),
                ConfigReader.getConfigValue("mobilePhone"),
                ConfigReader.getConfigValue("workPhone")
        );
    }

    @When("selects terms and policy")
    public void selects_terms_and_policy() {
        signUpPage.clickAgreeTerms();
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        signUpPage.clickRegisterBtn();
    }

}
