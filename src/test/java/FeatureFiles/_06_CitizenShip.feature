#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı sebaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Citizenships Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShips
  @RegressionTest @SmokeTest
  Scenario: Create a Citizenship with parameter 1 pozitif test
    When Create a Citizenships name as "SefaCitizenship12345" shortname as "12345CitizenSefa"
    Then Success message should be displayed
  @RegressionTest
  Scenario:Create a Citizenship with parameter 1 Negatif
    When Create a Citizenships name as "SefaCitizenship12345" shortname as "12345CitizenSefa"
    Then Already exists message should be displayed
  @RegressionTest
  Scenario: Delete Citizenship
    When user delete name as "SefaCitizenships1234"
    Then Success message should be displayed