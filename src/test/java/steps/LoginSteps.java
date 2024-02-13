package steps;

import com.MagentoLuna.Base;
import com.MagentoLuna.Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Base {
    LoginPage loginPage;
    @When("User click on signing and fill valid email and password and click on signin button")
    public void user_click_on_signing_and_fill_valid_email_and_password_and_click_on_signin_button() {
        loginPage =new LoginPage();
        loginPage.performLogin();

    }
    @Then("User should navigate at the homepage")
    public void user_should_navigate_at_the_homepage() {
        loginPage.performLoginDisplay();

    }

}
