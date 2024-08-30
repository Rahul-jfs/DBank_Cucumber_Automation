package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class,'card-header')]//strong")
    WebElement changePasswordHeading;

    @FindBy(xpath = "//div[@class='card-title']//h3")
    WebElement updatePasswordHeading;

    @FindBy(id = "currentPassword")
    WebElement currentPasswordInput;

    @FindBy(id = "newPassword")
    WebElement newPasswordInput;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(id = "payment-button")
    WebElement updateBtn;

    @FindBy(xpath = "(//div[contains(@class,'alert-success')]/span)[2]")
    WebElement passwordChangedMsg;

    public boolean isChangePasswordPageDisplayed() {
        return changePasswordHeading.getText().equals("Change Password") && updatePasswordHeading.getText().equals("Update New Password");
    }

    public void enterCurrentPasswordAndNewPassword(String currentPassword, String newPassword, String confirmPassword) {
        currentPasswordInput.sendKeys(currentPassword);
        newPasswordInput.sendKeys(newPassword);
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickUpdateBtn() {
        updateBtn.click();
    }

    public boolean isPasswordChanged() {
        return passwordChangedMsg.getText().equals("Password Updated Successfully.");
    }
}
