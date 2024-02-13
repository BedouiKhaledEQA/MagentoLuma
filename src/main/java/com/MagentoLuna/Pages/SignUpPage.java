package com.MagentoLuna.Pages;

import com.MagentoLuna.Base;
import com.MagentoLuna.Locators.SignUpLocators;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends SignUpLocators {
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }
    public void performSignUp() throws InterruptedException {
       /* CreateAccountButton1.click();
        FirstName.sendKeys(Base.props.getProperty("firstname"));
        LastName.sendKeys(Base.props.getProperty("lastname"));
        Email.sendKeys(Base.props.getProperty("email"));
        Thread.sleep(5000);
        Actions actions =new Actions(driver);
        actions.scrollToElement(CreateAnAccountButton).perform();
        Thread.sleep(2000);
        Password.sendKeys(Base.props.getProperty("password"));
        ConfirmPassword.sendKeys(Base.props.getProperty("confirmPassword"));
        Thread.sleep(3000);
        CreateAnAccountButton.click();*/
        Faker faker = new Faker();

        // Générer des données aléatoires
        String Firstname = faker.name().firstName();
        String Lastname = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String password =("Test123456&");
        String confirmPassword=("Test123456&");

        // Remplir le formulaire avec les données aléatoires
        CreateAccountButton1.click();
        FirstName.sendKeys(Firstname);
        LastName.sendKeys(Lastname);
        Email.sendKeys(email);
        Password.sendKeys(password);
        ConfirmPassword.sendKeys(confirmPassword);
        CreateAnAccountButton.click();
        Thread.sleep(2000);


    }
    public void signupDisplay(){
        String Registration =RegistrationDone.getText();
        Assert.assertEquals(Registration,"Thank you for registering with Main Website Store.");

    }
}
