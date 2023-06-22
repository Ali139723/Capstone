package first.project.bdd.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import first.project.bdd.framework.pages.POMFactory;
import first.project.bdd.framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@When("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on SignIn option");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("user entered email" + emailValue + "and password" + passwordValue);
	}

	@When("User click on login button")
	 public void userClickOnLoginButton(){
   click(factory.signInPage().loginButton);
   logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	}
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createAccountButton);
	    logger.info("User clicked on 'Create New Button'");
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	    List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
	    sendText(factory.signInPage().nameInputField, signUpInformation.get(0).get("name"));
	  
	    sendText(factory.signInPage().emailInputField, signUpInformation.get(0).get("email"));
	    sendText(factory.signInPage().passwordInputField, signUpInformation.get(0).get("password"));
	    sendText(factory.signInPage().confirmPasswordInputField, signUpInformation.get(0).get("confirmPassword"));
	    logger.info("User filled all the inputs");
	  
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		  click(factory.signInPage().signUpButton);
		    logger.info("User clicked on sign up button");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
    Assert.assertTrue(isElementDisplayed(factory.accountPage().profileLogo));
    logger.info("Profile loge displayed ");
	}


}
