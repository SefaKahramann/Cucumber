Feature: Country Senaryo Outline
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

  Scenario Outline: Country with Parameter
    When Create a country name as "<name>" code as "<shortname>"
    Then Success message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      |name      | shortname     |
      |is2mCs16  | is2mCs16Short |
      |is2mCs25  | is2mCs15Short |
      |is2mCs34  | is2mCs14Short |
      |is2mCs43  | is2mCs13Short |
      |is2mCs52  | is2mCs12Short |
      |is2mCs61  | is2mCs11Short |