#Author: LaxmiNarayanJena
@Search-Cars
Feature: Acceptance testing to validate search cars page is working
  In order to validate that the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to the Menu
      | Menu     |
      | Buy+Sale |
      | reviews  |
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select "1 SERIES" as car model
    And select location as "Australia" from SelectLocation dropdown
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series for Sale | carsguide"
