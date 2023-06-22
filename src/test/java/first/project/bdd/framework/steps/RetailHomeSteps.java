package first.project.bdd.framework.steps;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import first.project.bdd.framework.pages.POMFactory;
import first.project.bdd.framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailHomeSteps extends CommonUtility {
      private POMFactory factory= new POMFactory();
      
      @Given ("User is on the retail website")
      public void userIsOnTheRetailWebsite() {
    	  System.out.println();
    	  String actualTitle = getTitle();
    	  String expected = "React App";
    	  Assert.assertEquals(actualTitle, expected);
    	  Assert.assertTrue(isElementDisplayed(factory.homePage().TekSchoolLogo));
    	  logger.info("Atual title mached the expected");
      }
      
      @When("User search for {string} product")
      public void userSearchForProduct(String productValue) {
    	  sendText(factory.homePage().searchInputBar, productValue);
    	  click(factory.homePage().searchInputButton);
    	  logger.info("user searched for product  "+ productValue);
      }
      
      @Then("The product should be displayed")
      public void theProductShouldBeDisplayed() {
    	  Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
    	  logger.info("the Product is displayed on home Page");
      }
      
    
      @When("User click on All section")
      public void userClickOnAllSection() {
      click(factory.homePage().allSection);
      logger.info("User clicked on all section");
      }
      
      @Then("below options are present in Shop by Department sidebar")
      public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
    	  List<List<String>> expectedSideBar = dataTable.asLists(String.class);
    	  List<WebElement> actualSideBar = factory.homePage().sideBar;
        
    	  for(int i = 0 ; i < expectedSideBar.get(0).size();i++) {
    		  Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
    		  logger.info(actualSideBar.get(i).getText()+" is equals to "+ expectedSideBar.get(0).get(i));
    	  }
    	  
    	  
    	  
      }
      @When("User on {string}")
	  public void userOnElectronics(String department) {
	    List<WebElement> sideBarOptions = factory.homePage().sideBar;
	    for(WebElement option:sideBarOptions) {
	    	if(option.getText().equals(department)) {
	    		click(option);
	    		break;
	    	}
	    }
	  }
	  
	  @Then("below options are present in department")
	  public void belowOptionsArePresentInDepartment(DataTable dataTable) {
        List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
        List<WebElement> actualDepartmentOptions = factory.homePage().sideBar;
        
        for(int i=0; i<expectedDepartmentOptions.get(0).size();i++) {
        	for(WebElement dept:actualDepartmentOptions) {
        		if(dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
        			Assert.assertTrue(isElementDisplayed(dept));
        			logger.info(dept.getText()+"is present");
        		}
        	}
        }
	  }
	  
	  @Then("User change the category to {string}")
	  public void userChangeTheCategoryTo(String string) {
	    selectByVisibleText(factory.homePage().smartHomeSection, string);
	    logger.info("User clicked on smart home option");
	  }
	  @Then("User search for an item {string}")
	  public void userSearchForAnItem(String string) {
	     sendText(factory.homePage().searchInputBar, string);
	     logger.info("User search for " + string);
	  }
	  @Then("User click on Search icon")
	  public void userClickOnSearchIcon() {
	  click(factory.homePage().searchInputButton);
	  logger.info("User clicked on search button");
	  }
	  @Then("User click on item")
	  public void userClickOnItem() {
       click(factory.homePage().kasaItem);
       logger.info("user clicked on kasa item");
	  }
	  @Then("User select quantity {string}")
	  public void userSelectQuantity(String string) {
	  selectByValue(factory.homePage().quantity,string);
	  logger.info("User selected the quantity"); 
	  }
	  @Then("User click add to Cart button")
	  public void userClickAddToCartButton() {
       click(factory.homePage().addCartButton);
       logger.info("User clicked on add cart button");
	  }
	  @Then("the cart icon quantity should change to {string}")
	  public void theCartIconQuantityShouldChangeTo(String string) {
	     Assert.assertEquals(factory.homePage().quantityInCart.getText(), string);
	     logger.info("quantity added");
	     
	     
	  }
	  @Then("User click on Cart option")
	  public void userClickOnCartOption() {
	    click(factory.homePage().quantityInCart);
	    logger.info("User clicked on cart option");
	  }
	  @Then("User click on Proceed to Checkout button")
         public void userClickOnProceedToChekoutButton(){
		  click(factory.homePage().proceedToCheckoutButton);
		  logger.info("User clicked on proceed to checkout");
	  
	  }
	  @Then("User click Add a new address link for shipping address")
	  public void userClickAddANewAddressLinkForShippingAddress() {
	   click(factory.homePage().addAddressButton);
	   logger.info("User clicked on add address option");
	   
	  }
	  @And("User click Add a credit card or Debit Card for Payment method")
	  public void userClickAddaCreditCartorDebitCardForPaymentMetho() {
		  waitTillPresence(factory.homePage().addPaymentBtn);
		  click(factory.homePage().addPaymentBtn);
		  logger.info("User clicked on add payment");
	  }
	 
	  
	  @Then("User click on Place Your Order")
	  public void userClickOnPlaceYourOrder() {
		  waitTillPresence(factory.homePage().placeOrderBtn);
	   clickElementWithJS(factory.homePage().placeOrderBtn);
	   logger.info("User clicked on order button");
	  }
	  @Then("a message should be displayed ‘Order Placed, Thanks")
	  public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	    Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlaced));
	    logger.info("order placed");
	  }
      
}
 