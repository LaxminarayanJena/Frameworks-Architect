Feature: Login
In order to perform sucessfull login
As a user
I want to enter correct username and password

Scenario: In order to verify login to facebook as valid user
 	Given user navigates to facebook website
 	When user validates the homepage title
 	Then user entered the valid username
 	And user entered the valid password 
 	Then user should be sucessfully logged in
 	
 	Scenario: In order to verify login to facebook as Invalid user
 	Given user navigates to facebook website
 	When user validates the homepage title
 	Then user entered the invalid username
 	And user entered the invalid password 
 	Then user should not be sucessfully logged in