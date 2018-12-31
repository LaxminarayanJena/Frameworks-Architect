Feature: Validation of car search page
  In order to validate car search
  as a buyer
  I navigate https://www.carsguide.com.au/

  Scenario: Searching for a new car
    Given i am on the homepage https://www.carsguide.com.au/ website
    When i move to buy+sale menu
    Then I click on search cars
    And i select make as "BMW"
    And I select model as "1 SERIES"
    And select location as "Australia"
    And I click on Find My next car button
    Then I should see list of searched cars from "BMW"
    And the page title should be "Bmw 1 Series for Sale | carsguide"
