package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    HomePage homePage = new HomePage();


    @Then("verify user successfully signed in")
    public void verifyUserSuccessfullySignedIn() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }


    @When("user clicks on saving menu")
    public void user_clicks_on_saving_menu() {
        homePage.clickOnSavingMenu();
    }

    @When("selects new saving option")
    public void selects_new_saving_option() {
        homePage.selectSavingOption();
    }
}
