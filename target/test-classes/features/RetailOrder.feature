Feature: Retail Order Page

  @cancelOrderTest
  Scenario: Verify User can cancel the order
    Given User is on the retail website
    When User click on sign in option
    And User enter email 'ali12345@gmail.com' and password 'AsDf@1234'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason ‘Bought wrong item’
    And User click on Cancel Order button
    Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’

  @returnTest
  Scenario: Verify User can Return the order
    Given User is on the retail website
    When User click on sign in option
    And User enter email 'ali12345@gmail.com' and password 'AsDf@1234'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason ‘Item damaged’
    And User select the drop off service ‘FedEx’
    And User click on Return Order button
    Then a cancelation message should be displayed ‘Return was successful’

  @reviewTest
  Scenario: Verify User can write a review on order placed
    Given User is on the retail website
    When User click on sign in option
    And User enter email 'ali12345@gmail.com' and password 'AsDf@1234'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline ‘ headline value’ and ‘review text’
    And User click Add your Review button
    Then a review message should be displayed ‘Your review was added successfully’
