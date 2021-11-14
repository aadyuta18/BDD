package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    //@Given("Sergey is researching things on the internet")
    //public void sergey_is_researching_things_on_the_internet(){
  //      System.out.println("testing A");

   // }

   // @When("he looks up {String}")
   // public void he_looks_up(String string){
   //     System.out.println("testing B");
  //  }

   // @Then("he should see information about {String}")
   // public void he_should_see_information_about(String string) {
   //     System.out.println("testing c");

 //   }

    @Given("I am on the Login Page")
    public void i_am_on_the_Login_Page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        System.out.println("a");
    }

    @When("I enter my username and password correctly")
    public void i_enter_my_username_and_password_correctly() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
        System.out.println("b");
    }

    @When("I click {string} button")
    public void i_click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        System.out.println("c");
    }

    @Then("I am taken to the dashboard")
    public void i_am_taken_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
       //throw new cucumber.api.PendingException();
        System.out.println("d");
    }

}