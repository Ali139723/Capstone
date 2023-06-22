@AccountTest
Feature: Retail Account Page Features

  Background: 
    Given User is on the retail website
    When User click on sign in option
    And User enter email 'ali12345@gmail.com' and password 'AsDf@1234'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Johkn' and Phone '2533665555'
    And User click on Update button
    Then user profile information should be updated

  @updatePasswordTest
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | ASDf@1234        | AsDf@1234   | AsDf@1234       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @paymentMethodTest
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567899876541 | John       |               8 |           2029 |          555 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @editCardTest
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2255447788996633 | Jack       |               9 |           2026 |          588 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @cardDeleteTest
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @addAddressTest
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt  | city  | state  | zipCode |
      | Afghanistan | Ali Ali  |  2222223322 | 1222 S 140 St | k900 | Abcds | Kabul |   25000 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’
    
    @addressEditTest
    
    Scenario: Verify User can edit an Address added on account
When User click on Account option 
And User click on edit address option 
And user fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|Afghanistan | Ali | 5556664455 | 8000 St | 80 | Farah | Farah | 80000 |
And User click update Your Address button 
Then a message should be displayed ‘Address Updated Successfully’
    
    @deleteAddressTest
Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed