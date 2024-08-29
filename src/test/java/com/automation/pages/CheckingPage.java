package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckingPage extends BasePage {

    @FindBy(id = "Standard Checking")
    WebElement standardChecking;

    @FindBy(id = "Interest Checking")
    WebElement interestChecking;

    @FindBy(id = "Individual")
    WebElement individualOwnership;

    @FindBy(id = "Joint")
    WebElement jointOwnership;

    @FindBy(id = "name")
    WebElement accountNameInput;

    @FindBy(id = "openingBalance")
    WebElement initialDepositInput;

    @FindBy(id = "newCheckingSubmit")
    WebElement newCheckingSubmitBtn;

    @FindBy(xpath = "//div[@id='firstRow']/div//div[@class='h4 m-0'][1]")
    List<WebElement> accountNameList;

    @FindBy(xpath = "//div[@id='firstRow']/div//div[@class='h4 m-0'][2]")
    List<WebElement> accountDepositList;


    public boolean isCheckingPageDisplayed() {
        return newCheckingSubmitBtn.isDisplayed() && standardChecking.isDisplayed();
    }

    public void enterAccountTypeAndAccountOwnership(String accType, String accOwnership) {
        if (accType.equals("Standard")) {
            standardChecking.click();
        } else {
            interestChecking.click();
        }
        if (accOwnership.equals("Individual")) {
            individualOwnership.click();
        } else {
            jointOwnership.click();
        }
    }

    public void clickCheckingSubmitButton() {
        newCheckingSubmitBtn.click();
    }

    public boolean isCheckingAccountCreated(String accountName, String initialDeposit) {
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
