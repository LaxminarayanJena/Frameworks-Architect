Feature: Login to Production

In order to perform sucessfull login to Production
As a user
I want to enter correct username and password

Background:
Given user naviagtes to facebook website
When user validates the homepage title

Scenario: In order to verify login to facebook production

Then  user entered "valid" username
And user entered "valid" password
And user validates the captcha image
Then user "shouldbe" sucessfully logged in


Scenario: In order to verify login to facebook production
Then  user entered "invalid" username
And user entered "invalid" password
And user validates the captcha image
Then user "shouldnotbe" sucessfully logged in