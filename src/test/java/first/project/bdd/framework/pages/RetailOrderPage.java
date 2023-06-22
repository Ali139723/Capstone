package first.project.bdd.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import first.project.bdd.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
	PageFactory.initElements(getDriver(), this);
}
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderButton;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[2]")
	public WebElement order;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement reasonDropDown;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement cancelOrderSubmitBtn;
	
	@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement ordercanceledConfirmation;
	
	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement returnButton;
	
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement dropOffInput;
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
	public WebElement returnMessage;
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewButton;
	
	@FindBy(xpath="//input[@id='headlineInput']")
	public WebElement reviewHeadline;
	
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement reviewBody;
	
	@FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement reviewButtonsubmit;
	
	@FindBy(xpath="//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewConfirmation;
	
	
	
	
}
