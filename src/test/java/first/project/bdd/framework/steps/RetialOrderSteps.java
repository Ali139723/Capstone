package first.project.bdd.framework.steps;

import org.junit.Assert;

import first.project.bdd.framework.pages.POMFactory;
import first.project.bdd.framework.utilities.CommonUtility;
import io.cucumber.java.en.Then;

public class RetialOrderSteps extends CommonUtility {
	private POMFactory factory= new POMFactory();
    
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
     click(factory.orderPage().orderButton);
     logger.info("User clicked on order button");
	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
       click(factory.orderPage().order);
       logger.info("User clicked on one of the orders");
	}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
      click(factory.orderPage().cancelOrder);
      logger.info("User clicked on cancel button");
	}
	@Then("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
      selectByValue(factory.orderPage().reasonDropDown, "wrong");
       logger.info("User selected a reason for cancelation");
	}
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	click(factory.orderPage().cancelOrderSubmitBtn);
	logger.info("User submitted the cancelation");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
     Assert.assertTrue(isElementDisplayed(factory.orderPage().ordercanceledConfirmation));
     logger.info("confirmed");
	}

	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	 click(factory.orderPage().returnButton);
	 logger.info("User clicked on return button");
	}
	@Then("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
	  selectByValue(factory.orderPage().reasonDropDown, "wrong" );
	  logger.info("User selected a reason");
	}
	@Then("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
	   selectByValue(factory.orderPage().dropOffInput, "fedex");
	   logger.info("User selected a service");
	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	 click(factory.orderPage().cancelOrderSubmitBtn);
	 logger.info("User selected the return");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
	  Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMessage));
	}
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	    logger.info("User clicked on review");
	}
	@Then("User write Review headline ‘ headline value’ and ‘review text’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() {
	   sendText(factory.orderPage().reviewHeadline, "fkjdj" );
	   sendText(factory.orderPage().reviewBody, "fkjdttj" );
	   logger.info("User filled the from");
	   
	}
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	  click(factory.orderPage().reviewButtonsubmit);
	  logger.info("User clicked on submittion");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.orderPage().reviewConfirmation);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewConfirmation));
	    logger.info("Revies confirmed");
	}
}
