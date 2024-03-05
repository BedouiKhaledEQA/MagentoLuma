package com.MagentoLuna.Pages;


import com.MagentoLuna.Locators.SignUpLocators;

import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends SignUpLocators {
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }
    private static SignUpPage instance;
     UserPage userPage ;

    public static SignUpPage getInstance() {
        if (instance == null) {
            instance = new SignUpPage();
        }
        return instance;
    }
    public void performSignUp() throws InterruptedException {
        userPage =new UserPage();
        // Remplir le formulaire avec les données aléatoires
        CreateAccountButton1.click();
        FirstName.sendKeys(userPage.getFirstName());
        LastName.sendKeys(userPage.getLastName());
        Email.sendKeys(userPage.getEmail());
        Password.sendKeys(userPage.getPassword());
        ConfirmPassword.sendKeys(userPage.getConfirmPassword());
        CreateAnAccountButton.click();
        Thread.sleep(2000);


    }
    public void signupDisplay(){
        String Registration =RegistrationDone.getText();
        Assert.assertEquals(Registration,"Thank you for registering with Main Website Store.");

    }
}
