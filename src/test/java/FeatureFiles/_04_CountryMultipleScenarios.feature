Feature: Country Functionality

  Background:  #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country


  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a country 2
    When Create a country name as "ÜlkeSefa123" code as "ÜlkeSefa321"
    Then Success message should be displayed