#CitizenShip menusunun kayıt ve silme özelliğini
#(DataTable ile) 5 farklı değer seti ile çalıştırınız.
Feature: CitizenShip Functionality DataTable and Scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name>      |
      | shortName | <shortname> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name         | shortname   |
      | sf1234125    | sf32332     |
      | sfsf123      | sfsf12321   |
      | sfsfsaf123   | sdgsd123    |
      | qweqwe123    | qweqwe12334 |
      | sdgsdgsdg213 | jfgjfgj123  |

