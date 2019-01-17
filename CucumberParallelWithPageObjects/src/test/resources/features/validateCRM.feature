Feature: Login to zoho and validate CRM

  Scenario Outline: Navigate to zoho.com
    Given launch browser '<browserName>'
    When user navigates to the URL 'http://zoho.com'
    Then user click on login

    Examples: 
      | browserName |
      | chrome      |
      | firefox     |
