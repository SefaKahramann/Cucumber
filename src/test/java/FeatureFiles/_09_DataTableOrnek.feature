Feature: Datatable Example

  Scenario: User write
    When Write username "Sefa"
    When Write username and password "Sefa" and "1234"

    And Write usernema as Datatable
      | ismet   |
      | Sefa    |
      | Merve   |
      | Ummuhan |
      | Serkan  |

    And Write usernema and password as Datatable
      | ismet   | 1234         |
      | Sefa    | 123456       |
      | Merve   | 1234567      |
      | Ummuhan | 1234512412   |
      | Serkan  | 123456325235 |

    #dataProvider (TestNG için), Senaryo Outline (cucumber)
    #görevi verilen her değer için, tüm senayo çalışır
    #DataTable ise , sadece bir step e, çoklu parametre vermek
    #için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar