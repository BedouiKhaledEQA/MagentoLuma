package com.MagentoLuna.Locators;

import com.MagentoLuna.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLocators extends Base {
    public SignUpLocators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Create an Account')]")
    protected
    WebElement CreateAccountButton1;
    @FindBy(id = "firstname")
    protected
    WebElement FirstName;
    @FindBy(id = "lastname")
    protected
    WebElement LastName;
    @FindBy(name = "email")
    protected
    WebElement Email;
    @FindBy(id = "password")
    protected
    WebElement Password;
    @FindBy(id = "password-confirmation")
    protected
    WebElement ConfirmPassword;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    protected
    WebElement CreateAnAccountButton;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]")
    protected
    WebElement RegistrationDone;

}
