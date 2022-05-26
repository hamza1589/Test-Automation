package com.ebay.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    @FindBy(linkText = "register")
    private WebElement registerBtn;

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void typeOnSearchBar(String data) {
        searchBar.sendKeys(data);
    }
    public void clickOnSignInButton(){
        signInBtn.click();
    }
    public void clickOnRegisterButton(){
        registerBtn.click();
        ExtentTestManager.log("Clicked on Register button ");
    }
}
