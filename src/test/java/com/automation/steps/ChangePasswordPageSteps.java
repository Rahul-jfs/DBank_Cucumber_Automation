package com.automation.steps;

import com.automation.pages.ChangePasswordPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangePasswordPageSteps {

    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @Then("verify password change page is displayed")
    public void verifyPasswordChangePageIsDisplayed() {
        Assert.assertTrue(changePasswordPage.isChangePasswordPageDisplayed());
    }

    @When("user enters currentPassword {string} newPassword {string} and confirmPassword {string}")
    public void userEntersCurrentPasswordNewPasswordAndConfirmPassword(String currentPassword, String newPassword, String confirmPassword) {
        changePasswordPage.enterCurrentPasswordAndNewPassword(ConfigReader.getConfigValue(currentPassword),ConfigReader.getConfigValue(newPassword),ConfigReader.getConfigValue(confirmPassword));
    }

    @And("clicks on update button")
    public void clicksOnUpdateButton() {
        changePasswordPage.clickUpdateBtn();
    }

    @Then("verify password changed successfully Msg is displayed")
    public void verifyPasswordChangedSuccessfullyMsgIsDisplayed() {
        Assert.assertTrue(changePasswordPage.isPasswordChanged());
    }
}
