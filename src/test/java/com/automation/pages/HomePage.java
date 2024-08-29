package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "page-title")
    WebElement homePageTitle;

    @FindBy(xpath = "//div[@class='row']/div")
    WebElement homePageCategories;

    @FindBy(id = "savings-menu")
    WebElement savingMenu;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingMenu;

    @FindBy(id = "checking-menu")
    WebElement checkingMenu;

    @FindBy(id = "new-checking-menu-item")
    WebElement newCheckingMenu;

    @FindBy(xpath = "//img[contains(@class,'user-avatar')]")
    WebElement userProfile;

    @FindBy(xpath = "//div[contains(@class,'user-area')]//a[contains(text(),'Logout')]")
    WebElement logoutBtn;

    @FindBy(xpath = "//div[contains(@class,'user-area')]//a[contains(text(),'My Profile')]")
    WebElement myProfileBtn;


    public boolean isHomePageDisplayed() {
        return homePageTitle.getText().equals("Dashboard") && homePageCategories.isDisplayed();
    }

    public void clickOnSavingMenu() {
        savingMenu.click();
    }

    public void selectSavingOption() {
        newSavingMenu.click();
    }

    public void clickOnProfile() {
        userProfile.click();
    }

    public boolean isProfileRelatedOptionsDisplayed() {
        return logoutBtn.isDisplayed() && myProfileBtn.isDisplayed();
    }

    public void clickLogoutBtn() {
        logoutBtn.click();
    }

    public void clickOnCheckingMenu() {
        checkingMenu.click();
    }

    public void selectNewCheckingOption() {
        newCheckingMenu.click();
    }
}
