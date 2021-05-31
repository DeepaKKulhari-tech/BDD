package stepDefinations;
import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AddToWishlistStepDefination {

    @Given("^Authorization present and token is present$")
    public void authorization_present_and_token_is_present() throws Throwable {
       System.out.println("session value");
    }

    @When("^Hit the get resquest$")
    public void hit_the_get_resquest() throws Throwable {
        System.out.println("click the send button");
    }

    @Then("^Validate the reponse$")
    public void validate_the_reponse() throws Throwable {
     System.out.println("verfied the response");
    }

}