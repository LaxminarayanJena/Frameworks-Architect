Feature: Searching on google using Scenario Outline

Scenario Outline: Search Google from scenario outline

    Given launch browser '<browserName>'
    When user navigates to '<url>'
    Then user enters search term '<search>'
    And clicks on search button
    
    Examples:
    |browserName|url|search|
    |chrome|http://google.com|2nd feature 1st scenario|
    |firefox|http://google.com|2nd feature 2nd scenario|
    
