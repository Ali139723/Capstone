Feature: TEK Retail Application SignIn Feature

Scenario: Verify user can sign in into Retial Application
 	Given User is on the retail website
 	When User click on sign in option
 	And  User enter email 'ali12345@gmail.com' and password 'Asdf@1234'
 	And User click on login button
 	Then User should be logged in into Account
 	

 	Scenario Outline: Verify user can sign in into Retial Application
 	Given User is on the retail website
 	When User click on sign in option
 	And  User enter email '<email>' and password '<password>'
 	And User click on login button
 	Then User should be logged in into Account
 	Examples:
 	|email|password|
 	|ali12345@gmail.com|Asdf@1234|
 	|ali123456@gmail.com|Asdf@123456|
 	|ali@gmail.com|Asdf@1234|
 	 	@smokeTest
 	Scenario: Verify user can create an account into Retail Website
Given User is on the retail website
When User click on sign in option
And User click on Create New Account button
And User fill the signUp information with below data
| name | email | password | confirmPassword |
| panthers | panth444ersxy@tekschool.us | Tek@12345 | Tek@12345 |
And User click on SignUp button
Then User should be logged into account page