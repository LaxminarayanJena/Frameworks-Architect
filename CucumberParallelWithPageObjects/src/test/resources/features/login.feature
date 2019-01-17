Feature: Login to zoho

  Scenario: Navigate to zoho.com in Firefox and perform login
    Given launch browser 'firefox'
    When user navigates to the URL 'http://zoho.com'
    Then user click on login

  Scenario: Navigate to zoho.com in chrome and perform login
    Given launch browser 'firefox'
    When user navigates to the URL 'http://zoho.com'
    Then user click on login
