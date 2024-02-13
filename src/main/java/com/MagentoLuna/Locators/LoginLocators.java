package com.MagentoLuna.Locators;

import com.MagentoLuna.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators extends Base {
    public LoginLocators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    protected WebElement signingEnterButton;
    @FindBy(id = "email")
    protected WebElement email;
    @FindBy(id = "pass")
    protected WebElement password;
    @FindBy(id = "send2")
    protected WebElement signingButton;
    @FindBy(xpath = "//*[contains(text(),'Welcome, Hello Word!')]")
    protected WebElement profileLoggedIn;
}
