package fun.bdd;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckPasswordSteps {
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
		if (CheckPassword.isSecure(password))
			account = new Account(accountName, password);
		Assert.assertNotNull(account);
	}
}
