package stepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class TokenStepDefination {

	@Given("Encoded String for one particular Vendor Credentials")
	public void encoded_string_for_one_particular_vendor_credentials() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Method 2");
	}

	@And("^Library Name \"([^\"]*)\"$")
	public void library_name(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@Given("Access token end point")
	public void access_token_end_point() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Method 3");
	}

	@When("Run the Post request")
	public void run_the_post_request() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Method 4");
	}

	@Then("access token is generated value {int}")
	public void access_token_is_generated_value(Integer int1)

	{
		System.out.println(int1);
		
	}

	@Then("expires time should be displayed")
	public void expires_time_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Method 6");
	}

}