package com.MagentoLuna.Pages;

import com.MagentoLuna.Base;
import com.MagentoLuna.Locators.LoginLocators;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginLocators {
    private static LoginPage instance;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public static LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }


    public void performLogin(){
        signingEnterButton.click();
        email.sendKeys(Base.props.getProperty("email"));
        password.sendKeys(Base.props.getProperty("password"));
        signingButton.click();



    }
    public void performLoginDisplay(){
        String profileLogged=profileLoggedIn.getText();
        Assert.assertEquals(profileLogged,"Welcome, Hello Word!");

    }
}
