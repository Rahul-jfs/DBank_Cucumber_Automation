package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageSteps {

    HomePage homePage = new HomePage();


    @Then("verify user successfully signed in")
    public void verifyUserSuccessfullySignedIn() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
}
