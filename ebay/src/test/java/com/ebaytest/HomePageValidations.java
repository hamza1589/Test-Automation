package com.ebaytest;

import com.base.TestBase;
import com.ebay.data.DataProviders;
import com.ebay.pages.HomePage;
import com.ebay.pages.LoginPage;
import com.ebay.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Hard drive");
    }
    @Test(dataProviderClass = DataProviders.class,dataProvider = "searchData",enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchBar();
    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton(){
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSignInButton();
    }
    @Test(dataProviderClass = DataProviders.class,dataProvider = "credentials",enabled = false)
    public void validateUserBeingAbleToLogin(String emailField, String passField){
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        LoginPage loginPage =PageFactory.initElements(driver,LoginPage.class);
        homePage.clickOnSignInButton();
        loginPage.typeOnEmailField(emailField);
        loginPage.clickOnContinueButton();
        loginPage.typeOnPasswordField(passField);


    }
    @Test(enabled = false)
    public void validateUserCanRegister(){
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        RegisterPage registerPage=PageFactory.initElements(driver,RegisterPage.class);
        homePage.clickOnRegisterButton();
        registerPage.validateURL();
        registerPage.validateCrateAccountDisplayed();


    }
    @Test
    public void fieldsValidationOnRegisterPage(){
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        RegisterPage registerPage=PageFactory.initElements(driver,RegisterPage.class);
        homePage.clickOnRegisterButton();
        registerPage.validateFields();
    }
}
