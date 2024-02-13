package steps;

import com.MagentoLuna.Base;
import com.MagentoLuna.Pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends Base {
    SignUpPage signUpPage;
    @Given("User open the browser")
    public void user_open_the_browser() {
        luncher();

    }
    @When("User fill the credential and click on create an Account button")
    public void user_fill_the_credential_and_click_on_create_an_account_button() throws InterruptedException {
        signUpPage =new SignUpPage();
        signUpPage.performSignUp();

    }
    @Then("Registration should be done")
    public void registration_should_be_done() {

    }

}
