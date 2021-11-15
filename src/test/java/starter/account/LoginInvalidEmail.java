package starter.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginInvalidEmail {
    @Given("I already on the Login Page with case invalid email and valid password")
    public void i_am_on_the_Login_Page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        // System.out.println("a");
    }

    @When("I enter username and password with case invalid email and valid password")
    public void i_input_wrong_username_and_wrong_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @And("I click 'Login' button with case invalid email and valid password")
    public void i_click_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        //System.out.println("c");
    }

    @Then("I failed to login to the dashboard linkedin with case invalid email and valid password")
    public void i_failed_to_login_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

}



