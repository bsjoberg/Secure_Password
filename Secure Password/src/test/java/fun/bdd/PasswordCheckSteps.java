package fun.bdd;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PasswordCheckSteps {
	Account account = null;
	String accountName;
	String password;
	
	@Given("I want to create an account")
	public void iWantToCreateAnAccount() {
		accountName = "testAccountName";
	}

	@When("I enter {string}")
	public void iEnter(String password) {
	    this.password = password;
	}

	@Then("the account is created")
	public void theAccountIsCreated() {
		Assert.assertNotNull(account);
	}
}
