Feature: Searching on google

  Scenario: Direct search on google
    Given launch browser 'firefox'
    When user navigates to 'http://google.com'
    Then user enters search term '1st feature 1st scenario'
    And clicks on search button

  Scenario: Direct search on google
    Given launch browser 'chrome'
    When user navigates to 'http://google.com'
   Then user enters search term '1st feature 2nd scenario'
    And clicks on search button
