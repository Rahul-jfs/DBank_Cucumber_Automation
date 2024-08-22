package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage{

    @FindBy(id = "title")
    WebElement titleSelectInput;

    @FindBy(id = "firstName")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@value='M']")
    WebElement maleRadioBtn;

    @FindBy(xpath = "//input[@value='F']")
    WebElement femaleRadioBtn;

    @FindBy(id = "dob")
    WebElement dobInput;

    @FindBy(id = "ssn")
    WebElement ssnInput;

    @FindBy(id = "emailAddress")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement nextBtn;

    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(id = "locality")
    WebElement localityInput;

    @FindBy(id = "region")
    WebElement regionInput;

    @FindBy(id = "postalCode")
    WebElement postalCodeInput;

    @FindBy(id = "country")
    WebElement countryInput;

    @FindBy(id = "homePhone")
    WebElement homePhoneInput;

    @FindBy(id = "mobilePhone")
    WebElement mobilePhoneInput;

    @FindBy(id = "workPhone")
    WebElement workPhoneInput;

    @FindBy(id = "agree-terms")
    WebElement agreeTermsInput;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerBtn;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("website.url"));
    }

    public boolean isSignUpPageDisplayed() {
        return nextBtn.isDisplayed() && firstNameInput.isDisplayed();
    }

    public void enterSignUpCredentials(String title, String firstname, String lastname, String gender, String dob, String ssn, String email, String password, String confirmPassword) {
        Select titleSelect = new Select(titleSelectInput);
        titleSelect.selectByVisibleText(title);
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        if(gender.equals("M")){
            maleRadioBtn.click();
        }else {
            femaleRadioBtn.click();
        }
        dobInput.sendKeys(dob);
        ssnInput.sendKeys(ssn);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(confirmPassword);
     }

    public void clickNextBtn() {
        nextBtn.click();
    }

    public boolean isNextSignUpPageDisplayed() {
        return registerBtn.isDisplayed() && addressInput.isDisplayed();
    }

    public void enterOtherDetails(String address, String locality, String region, String postalCode, String country, String homePhone, String mobilePhone, String workPhone) {
        addressInput.sendKeys(address);
        localityInput.sendKeys(locality);
        regionInput.sendKeys(region);
        postalCodeInput.sendKeys(postalCode);
        countryInput.sendKeys(country);
        homePhoneInput.sendKeys(homePhone);
        mobilePhoneInput.sendKeys(mobilePhone);
        workPhoneInput.sendKeys(workPhone);
    }

    public void clickAgreeTerms() {
        agreeTermsInput.click();
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }
}
