Feature: Verify User is able to search Bus

  Background: Create an instance of android or ios driver before each scenario
  #  Given User has launched Abhibus "android" app

  Scenario: User should be able to select bus
    Given User has launched Abhibus "android" app
    When User enters Leaving from as "Bangalore" place
    And User enters going to as "Chennai" place
    And User selects departure date
    And User click on Search button
    And user should be able to scroll for search bus
