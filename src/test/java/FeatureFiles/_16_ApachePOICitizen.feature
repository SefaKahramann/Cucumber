Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShips

  Scenario: Create and Delete CitizenShip from excel
     When User Create citizenShip with ApachePOI
     Then User Delete citizenShip with ApachePOI