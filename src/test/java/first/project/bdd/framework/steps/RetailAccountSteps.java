package first.project.bdd.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import first.project.bdd.framework.pages.POMFactory;
import first.project.bdd.framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailAccountSteps extends CommonUtility{
    private POMFactory factory = new POMFactory();
    
    @When("User click on Account option")
    public void userClickOnAccountOption() {
      click(factory.accountPage().accountButton);
      logger.info("User clicked on account button");
    }
    @When("User update Name {string} and Phone {string}")
    public void userUpdateNameNameValueAndPhonePhoneValue(String name, String phone) {
       clearTextUsingSendKeys(factory.accountPage().nameInput);
       sendText(factory.accountPage().nameInput,name);
       clearTextUsingSendKeys(factory.accountPage().phoneInput);
       sendText(factory.accountPage().phoneInput,phone);
       logger.info("User updated the name and phone");
    	
    }
    @When("User click on Update button")
    public void userClickOnUpdateButton() {
      click(factory.accountPage().updatButton);
   logger.info("User clicked on update button");
    }
    @Then("user profile information should be updated")
    public void userProfileInformationShouldBeUpdated() {
      waitTillPresence(factory.accountPage().successfulMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().successfulMessage));
     logger.info("Successfully updated");
    }
    
    @When("User enter below information")
    public void userEnterBelowInformation(DataTable dataTable) {
        List<Map<String, String>> passinfo = dataTable.asMaps(String.class, String.class);
        sendText(factory.accountPage().previousPasswordField, passinfo.get(0).get("previousPassword"));
        sendText(factory.accountPage().newPasswordField, passinfo.get(0).get("newPassword"));
        sendText(factory.accountPage().confirmPasswordInput, passinfo.get(0).get("confirmPassword"));
        logger.info("User filled the password data");
    }
    @When("User click on Change Password button")
    public void userClickOnChangePasswordButton() {
    	click(factory.accountPage().changePasswordButton);
    	
    	logger.info("User clicked on change password");
       
    }
    @Then("a message should be displayed ‘Password Updated Successfully’")
    public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().passUdateMessage);
     Assert.assertTrue(isElementDisplayed(factory.accountPage().passUdateMessage));
     logger.info("Success Message Appeared");
    }
    
    @When("User click on Add a payment method link")
    public void userClickOnAddAPaymentMethodLink() {
     click(factory.accountPage().addMethodOption);
     logger.info("User clicke on add method option");
    }
    @When("User fill Debit or credit card information")
    public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
    	List<Map<String, String>> creditinfo= dataTable.asMaps(String.class, String.class);
    	sendText(factory.accountPage().addNumberField, creditinfo.get(0).get("cardNumber"));
    	sendText(factory.accountPage().nameOnCard, creditinfo.get(0).get("nameOnCard"));
    	selectByValue(factory.accountPage().expirationMonth, creditinfo.get(0).get("expirationMonth"));
    	selectByValue(factory.accountPage().expirationYear, creditinfo.get(0).get("expirationYear"));
    	sendText(factory.accountPage().securityCode, creditinfo.get(0).get("securityCode"));
    	logger.info("User filled the form");
    	
   
    }
    @When("User click on Add your card button")
    public void userClickOnAddYourCardButton() {
    	click(factory.accountPage().addCardButton);
    	logger.info("User clicked on add your card button");
    }
    @Then("a message should be displayed ‘Payment Method added successfully’")
    public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
    	waitTillPresence(factory.accountPage().succesMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().succesMessage));
    	logger.info("card added successfully");
     
    }
    
    @When("User click on Edit option of card section")
    public void userClickOnEditOptionOfCardSection() {
    	click(factory.accountPage().cardOption);
    	waitTillPresence(factory.accountPage().cardEditOption);
    	click(factory.accountPage().cardEditOption);
    	logger.info("User clicked on edit option");

    }
    @When("user edit information with below data")
    public void userEditInformationWithBelowData(DataTable dataTable) {
    	List<Map<String, String>> cardEditInfo = dataTable.asMaps(String.class, String.class);
    	clearTextUsingSendKeys(factory.accountPage().cardEditNumberField);
    	sendText(factory.accountPage().cardEditNumberField, cardEditInfo.get(0).get("cardNumber"));
    	clearTextUsingSendKeys(factory.accountPage().nameOnCardEditOption);
    	sendText(factory.accountPage().nameOnCardEditOption, cardEditInfo.get(0).get("nameOnCard"));
    	selectByValue(factory.accountPage().expirationMonthEdit, cardEditInfo.get(0).get("expirationMonth"));
    	selectByValue(factory.accountPage().expirationYearEdit, cardEditInfo.get(0).get("expirationYear"));
    	clearTextUsingSendKeys(factory.accountPage().securityCodeEdit);
    	sendText(factory.accountPage().securityCodeEdit, cardEditInfo.get(0).get("securityCode"));
    	logger.info("User updated the info");

    }
    @When("user click on Update Your Card button")
    public void userClickOnUpdateYourCardButton() {
    	click(factory.accountPage().updateCardButtonEdit);
    	logger.info("User clicked on Update option");
 
    }
    @Then("a message should be displayed ‘Payment Method updated Successfully’")
    public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().SuccessEdit);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().SuccessEdit));
    	logger.info("Update message apeared");
    
    }
    @When("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection() {
     click(factory.accountPage().cardOption);
     waitTillPresence(factory.accountPage().cardEditOption);
     click(factory.accountPage().removeOption);
     logger.info("User clicked on remove option");
    }
    @Then("payment details should be removed")
    public void paymentDetailsShouldBeRemoved() {
      Assert.assertTrue(isElementDisplayed(factory.accountPage().addCardHeader));
      logger.info("Card removed");
    }
    
    @When("User click on Add address option")
    public void userClickOnAddAddressOption() {
      click(factory.accountPage().addAddressOption);
      logger.info("User clicked on add address");
    }
    @When("user fill new address form with below information")
    public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
     List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
       selectByValue(factory.accountPage().counrtyAddressField, addressInfo.get(0).get("country"));
       sendText(factory.accountPage().fullNameAddressField, addressInfo.get(0).get("fullName"));
       sendText(factory.accountPage().streetAddress, addressInfo.get(0).get("streetAddress"));
       clearTextUsingSendKeys(factory.accountPage().phoneNumberAddressField);
       sendText(factory.accountPage().phoneNumberAddressField, addressInfo.get(0).get("phoneNumber"));
       sendText(factory.accountPage().aptNumberField, addressInfo.get(0).get("apt"));
       sendText(factory.accountPage().cityField, addressInfo.get(0).get("city"));
       selectByVisibleText(factory.accountPage().stateAddressField, addressInfo.get(0).get("state"));
       clearTextUsingSendKeys(factory.accountPage().zipCode);
       sendText(factory.accountPage().zipCode, addressInfo.get(0).get("zipCode"));
       logger.info("User added the infromation for the Address");
    }
    @When("User click Add Your Address button")
    public void userClickAddYourAddressButton() {
    	click(factory.accountPage().addAddressButton);
    	logger.info("User clicked on add address button");
 
    }
    @Then("a message should be displayed ‘Address Added Successfully’")
    public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
      
    	waitTillPresence(factory.accountPage().addedAddressMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().addedAddressMessage));
    	logger.info("Address is added");
    }

    @When("User click on edit address option")
    public void userClickOnEditAddressOption() {
     click(factory.accountPage().addressEditOption);
     logger.info("User clicked on edit address");
    }
    @When("User click update Your Address button")
    public void userClickUpdateYourAddressButton() {
    	
      click(factory.accountPage().updateAddressButton);
      logger.info("User clicked on update Address Button");
    }
    @Then("a message should be displayed ‘Address Updated Successfully’")
    public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().addressUpdatedMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedMessage));
    	logger.info("Address is updated");
    }
    
    @When("User click on remove option of Address section")
    public void userClickOnRemoveOptionOfAddressSection() {
        click(factory.accountPage().removeAddress);
        logger.info("User clicked on remove Address");
    }
    @Then("Address details should be removed")
    public void addressDetailsShouldBeRemoved() {
     //   Assert.assertFalse(isElementDisplayed(factory.accountPage().removeAddress));
        logger.info("Address deleted");
    }

    
}
