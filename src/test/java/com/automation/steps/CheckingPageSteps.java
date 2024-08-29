package com.automation.steps;

import com.automation.pages.CheckingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckingPageSteps {

    CheckingPage checkingPage = new CheckingPage();

    @Then("verify create checking page is displayed")
    public void verifyCreateCheckingPageIsDisplayed() {
        Assert.assertTrue(checkingPage.isCheckingPageDisplayed());
    }

    @When("user enters checking account type {string} and account ownership {string}")
    public void userEntersCheckingAccountTypeAndAccountOwnership(String accType, String accOwnership) {
        checkingPage.enterAccountTypeAndAccountOwnership(ConfigReader.getConfigValue(accType), ConfigReader.getConfigValue(accOwnership));
    }

    @And("clicks on checking submit button")
    public void clicksOnCheckingSubmitButton() {
        checkingPage.clickCheckingSubmitButton();
    }

    @Then("verify checking account is created of account name {string} and initial deposit {string}")
    public void verifyCheckingAccountIsCreatedOfAccountNameAndInitialDeposit(String accountName, String initialDeposit) {
        Assert.assertTrue(checkingPage.isCheckingAccountCreated(ConfigReader.getConfigValue(accountName), ConfigReader.getConfigValue(initialDeposit)));
    }
}
