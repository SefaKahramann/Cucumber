Feature: DataTable  Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | SefaUlkesi |
      | codeInput | SefaKod1   |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | SefaUlkesi |

  Scenario: CitizenShip Create adn Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | SefaUlkesi |
      | shortName | SefaKod1   |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | SefaUlkesi |

  Scenario: Create Nationality adn Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | SefaUlkesi |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | SefaUlkesi |

    Then Success message should be displayed

  Scenario: Fee Functionality and delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | Fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput   | SefaFees1 |
      | codeInput   | 551000    |
      | integration | 123456    |
      | priority    | 12        |


    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | SefaFees1 |

    Then Success message should be displayed