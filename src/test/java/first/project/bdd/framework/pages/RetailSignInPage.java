package first.project.bdd.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import first.project.bdd.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(id="newAccountBtn")
	public WebElement createAccountButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInputField;
	
	@FindBy(id="emailInput")
	public WebElement emailInputField;
	
	
	@FindBy(id="passwordInput")
	public WebElement passwordInputField;
	
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInputField;
	
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	
	
}
