package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
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

    @When("user clicks on the profile picture")
    public void userClicksOnTheProfilePicture() {
        homePage.clickOnProfile();
    }

    @Then("verify profile related options are displayed")
    public void verifyProfileRelatedOptionsAreDisplayed() {
        Assert.assertTrue(homePage.isProfileRelatedOptionsDisplayed());
    }

    @When("user clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        homePage.clickLogoutBtn();
    }

    @When("user clicks on checking menu")
    public void userClicksOnCheckingMenu() {
        homePage.clickOnCheckingMenu();
    }

    @And("selects new checking option")
    public void selectsNewCheckingOption() {
        homePage.selectNewCheckingOption();
    }

    @And("clicks on change password")
    public void clicksOnChangePassword() {
        homePage.clickOnChangePasswordLink();
    }
}
