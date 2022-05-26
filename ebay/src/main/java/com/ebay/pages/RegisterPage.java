package com.ebay.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends TestBase {
    @FindBy(xpath = "//h1[text()='Create an account']")
    private WebElement createAccountHeading;

    @FindBy(id="firstname")
    private WebElement firstName;

    @FindBy(id="lastname")
    private WebElement lastName;

    @FindBy(id="Email")
    private WebElement email;

    public void validateCrateAccountDisplayed(){
        boolean flag=createAccountHeading.isDisplayed();
        Assert.assertTrue(flag);

    }
    public void validateURL(){
        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://signup.ebay.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
    public void validateFields(){
        Assert.assertTrue(firstName.isDisplayed());
        Assert.assertTrue(lastName.isDisplayed());
        Assert.assertTrue(email.isDisplayed());
    }
}
