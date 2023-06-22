package first.project.bdd.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import first.project.bdd.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
    
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
		
	
	}
	
	//@FindBy(locatorType= "Locator Value") accessModifier WebElement ElementName;
	@FindBy(id="signinLink")
	public WebElement signInButton;
	
	@FindBy(id="searchBtn")
    public WebElement searchInputButton;
    
    @FindBy(xpath = "//img[@class='image']")
    public WebElement pokemonImage;
    
    @FindBy(xpath ="//a[text()='TEKSCHOOL']")
	public WebElement TekSchoolLogo;
	
    @FindBy(id ="searchInput")
    public WebElement searchInputBar;
    
    @FindBy(id="accountLink")
    public WebElement accountOption;
    
    @FindBy(xpath="//span[contains(text(),'All')]")
    public WebElement allSection;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']/span")
    public List<WebElement> sideBar;
    
    @FindBy(id="search")
    public WebElement smartHomeSection;
    
    @FindBy(xpath="//select[@id='search']")
    public WebElement allDepartment;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")
    public WebElement kasaItem;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
    public WebElement quantity;
    
    @FindBy(xpath="//span[contains(text(),'Add to Cart')]")
    public WebElement addCartButton;
    
    @FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement quantityInCart;
    
    @FindBy(xpath="//button[@id='proceedBtn']")
    public WebElement proceedToCheckoutButton;
    
    @FindBy(xpath="//button[@id='addAddressBtn']")
    public WebElement addAddressButton;
    
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
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentBtn;
	
	@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlaced;
	
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeOrderBtn;
	
	
	
    
    
}
