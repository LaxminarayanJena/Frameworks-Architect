Feature: Login to Production

In order to perform sucessfull login to Production
As a user
I want to enter correct username and password

Scenario Outline: In order to verify login to facebook production
Given user navigates to facebook website
When user validates the homepage title
Then  user entered "<username>" username
And user entered "<password>" password
And user select the age category
|Age| location|
|below18|india|
|above18|germany|
Then user "<loginType>" sucessfully logged in

Examples:
|username|password|loginType|
|valid|valid|should|
|invalid|invalid|shouldnot|

