package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "userid")
    private WebElement emailField;

    @FindBy(id = "signin-continue-btn")
    private WebElement continueBtn;

    @FindBy(id = "pass")
    private WebElement passwordField;

    public void typeOnEmailField(String emailField){
        this.emailField.sendKeys("hamzacherfaoui32@gmail.com");
    }

    public void clickOnContinueButton(){
        continueBtn.click();
    }
    public void typeOnPasswordField(String passField){
        passwordField.sendKeys("Sameday458798.");
    }
}
