package first.project.bdd.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import first.project.bdd.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Your Profile')]")
	public WebElement profileLogo;
	
	@FindBy(id="accountLink")
	public WebElement accountButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updatButton;
	
	@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement successfulMessage;
	
	@FindBy(id="previousPasswordInput")
	public WebElement previousPasswordField;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordField;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePasswordButton;
	
	@FindBy(xpath="//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passUdateMessage;
	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement addMethodOption;
	
	@FindBy(id="cardNumberInput")
	public WebElement addNumberField;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement addCardButton;
	
	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement succesMessage;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
	public WebElement cardOption;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement cardEditOption;
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement cardEditNumberField;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCardEditOption;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement expirationMonthEdit;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement expirationYearEdit;
	
	@FindBy(xpath="//input[@id='securityCodeInput']")
	public WebElement securityCodeEdit;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement updateCardButtonEdit;
	
	@FindBy(xpath="//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement SuccessEdit;
	
	@FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement removeOption;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	public WebElement addCardHeader;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement addAddressOption;
	
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement counrtyAddressField;
	
	@FindBy(xpath="//input[@id='fullNameInput']")
	public WebElement fullNameAddressField;
	
	@FindBy(xpath="//input[@id='phoneNumberInput']")
	public WebElement phoneNumberAddressField;
	
	@FindBy(xpath="//input[@id='streetInput']")
	public WebElement streetAddress;
	
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement aptNumberField;
	
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement cityField;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/select[1]")
	public WebElement stateAddressField;
	
	@FindBy(xpath="//input[@id='zipCodeInput']")
	public WebElement zipCode;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addAddressButton;
	
	@FindBy(xpath="//div[contains(text(),'Address Added Successfully')]")
	public WebElement addedAddressMessage;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement addressEditOption;
	
	@FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedMessage;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement updateAddressButton;
	
	
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	public WebElement removeAddress;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
