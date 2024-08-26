package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.*;

public class SavingPage extends BasePage {

    @FindBy(id = "page-title")
    WebElement savingPageTitle;

    @FindBy(id = "Savings")
    WebElement savingAccountType;

    @FindBy(id = "Money Market")
    WebElement moneyMarketAccType;

    @FindBy(id = "Individual")
    WebElement individualOwnership;

    @FindBy(id = "Joint")
    WebElement jointOwnership;

    @FindBy(id = "name")
    WebElement accountNameInput;

    @FindBy(id = "openingBalance")
    WebElement initialDepositInput;

    @FindBy(id = "newSavingsSubmit")
    WebElement newSavingsSubmitBtn;

    @FindBy(xpath = "//div[@id='firstRow']/div//div[@class='h4 m-0'][1]")
    List<WebElement> accountNameList;

    @FindBy(xpath = "//div[@id='firstRow']/div//div[@class='h4 m-0'][2]")
    List<WebElement> accountDepositList;

    @FindBy(id = "new-account-msg")
    WebElement newAccountSuccessfulMsg;


    public boolean isSavingPageDisplayed() {
        return savingPageTitle.getText().equals("Create Savings") && newSavingsSubmitBtn.isDisplayed();
    }

    public void enterAccountTypeAndOwnership(String accountType, String ownership) {
        if (accountType.equals("Savings")) {
            savingAccountType.click();
        } else {
            moneyMarketAccType.click();
        }
        if (ownership.equals("Individual")) {
            individualOwnership.click();
        } else {
            jointOwnership.click();
        }
    }

    public void enterAccountNameAndInitialDeposit(String accountName, String initialDeposit) {
        accountNameInput.sendKeys(accountName);
        initialDepositInput.sendKeys(initialDeposit);
    }

    public void clickSubmitBtn() {
        newSavingsSubmitBtn.click();
    }

    public boolean isSavingAccountCreated(String accountName, String initialDeposit) {
        boolean isNameVerified = false;
        boolean isDepositVerified = false;

        for (int i = accountNameList.size() - 1; i >= 0; i--) {
            isNameVerified = accountNameList.get(i).getText().equals(accountName);
            String depositStr = accountDepositList.get(i).getText();
            isDepositVerified = depositStr.substring(depositStr.indexOf("$") + 1).equals(initialDeposit);
            break;
        }

        return isDepositVerified && isNameVerified;
    }
}
