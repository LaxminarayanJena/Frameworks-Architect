#Author: LaxmiNarayanJena
@UsedSearch-Cars
Feature: Acceptance testing to validate used search cars page is working
  In order to validate that the used search cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars
  Scenario: Validate Used Cars Page
    Given I navigate to the  HomePage "https://www.carsguide.com.au" of CarsGuide Website
    When I move to the topMenu
      | Menu     |
      | Buy+Sale |
      | reviews  |
    And click on the sub menu "Used" link
    
    And select carmake as "AUDI" from AnyMake dropdown
    
    And select the CarModel
      | CarModel |
      | A1     |
      | A3     |
    And select location  from SelectLocation dropdown as "ACT - All"
    And click on FindMyNextCar button
    Then I should see list of used cars
    And the page title should match expected title "Audi A1 for Sale ACT | carsguide"
