# Login fonsiyon Kontrolü
# Önce siteye git(Driver get)
# Sonra Login Bilgilerini gir(username password SendKeys)
# Siteye girdiğini doğrula(Verify,Assert)


Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully