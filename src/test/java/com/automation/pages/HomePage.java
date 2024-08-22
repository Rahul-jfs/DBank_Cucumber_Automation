package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "page-title")
    WebElement homePageTitle;

    public boolean isHomePageDisplayed() {
        return homePageTitle.getText().equals("Dashboard");
    }
}
