package com.automation.steps;

import com.automation.pages.SavingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SavingPageSteps {
    
    SavingPage savingPage = new SavingPage();


    @Then("verify create saving page is displayed")
    public void verify_create_saving_page_is_displayed() {
        Assert.assertTrue(savingPage.isSavingPageDisplayed());
    }

    @When("user enters saving account type {string} and account ownership {string}")
    public void user_enters_saving_account_type_and_account_ownership(String accountType, String ownership) {
        savingPage.enterAccountTypeAndOwnership(ConfigReader.getConfigValue(accountType), ConfigReader.getConfigValue(ownership));
    }

    @When("enters account name {string} and initial deposit {string}")
    public void enters_account_name_and_initial_deposit(String accountName, String initialDeposit) {
        savingPage.enterAccountNameAndInitialDeposit(ConfigReader.getConfigValue(accountName), ConfigReader.getConfigValue(initialDeposit));
    }

    @When("clicks on saving submit button")
    public void clicks_on_saving_submit_button() {
        savingPage.clickSubmitBtn();
    }

    @Then("verify saving account is created of account name {string} and initial deposit {string}")
    public void verifyAccountIsCreatedOfAccountNameAndInitialDeposit(String accountName, String initialDeposit) {
        Assert.assertTrue(savingPage.isSavingAccountCreated(ConfigReader.getConfigValue(accountName), ConfigReader.getConfigValue(initialDeposit)));
    }
}
