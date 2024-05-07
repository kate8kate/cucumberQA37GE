Feature: Find a car

  @carSearchByDateAndCity
  Scenario: Find a car by date and city
    Given User launches Chrome browser
    When User enters valid city name
    And User clicks on Dates input
    And User clicks on Start-Day on Calendar
    And User clicks on End-Day on Calendar
    And User clicks on Yalla button
    Then User verifies any Car Card is displayed
    And User quites browser