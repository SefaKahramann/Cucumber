Feature: Citizenships Functionality
  Scenario:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships
    When Create a Citizenships
    Then Success message should be displayed
