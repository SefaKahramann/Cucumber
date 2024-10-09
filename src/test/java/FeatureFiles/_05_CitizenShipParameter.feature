#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.
Feature: Citizenships Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships

  Scenario:
    When Create a Citizenships
    Then Success message should be displayed

  Scenario:
    When Create a Citizenships name as"SefaCitizenships123" shortname as "123CitizenSefa"
    Then Success message should be displayed