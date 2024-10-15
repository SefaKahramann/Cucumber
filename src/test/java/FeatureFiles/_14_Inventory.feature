#Inventory Bölümündeki
#Item Categories Çalışmasını test ediniz
#girişi yapıp , sonrasında silmesini yapınız

Feature: Inventory Functionality DataTable and Scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Inventory Create and Delete

    And Click on the Element in LeftNav
      | inventory      |
      | inventorySetup |
      | itemCategories |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | role        |
      | firstChoice |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |
    Examples:
      | name    |
      | Sefa    |
      | Merve   |
      | Ummuhan |
      | Serkan  |
      | Nigar   |

