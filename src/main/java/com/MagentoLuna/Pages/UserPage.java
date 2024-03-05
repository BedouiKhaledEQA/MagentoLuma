package com.MagentoLuna.Pages;

import com.MagentoLuna.Base;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends Base {
    public UserPage(){
        PageFactory.initElements(driver,this);
        Faker faker = new Faker();

        // Générer des données aléatoires
        String firstName = faker.name().firstName();
        String lastName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String password =("Test123456&");
        String confirmPassword=("Test123456&");

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

   private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;


    public UserPage(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        Faker faker = new Faker();

        // Générer des données aléatoires
        String firstName = faker.name().firstName();
        String lastName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String password =("Test123456&");
        String confirmPassword=("Test123456&");

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
