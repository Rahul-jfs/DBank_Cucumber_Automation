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


    public boolean isHomePageDisplayed() {
        return homePageTitle.getText().equals("Dashboard") && homePageCategories.isDisplayed();
    }

    public void clickOnSavingMenu() {
        savingMenu.click();
    }

    public void selectSavingOption() {
        newSavingMenu.click();
    }
}
