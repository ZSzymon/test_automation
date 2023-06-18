Feature: Zarządzanie koszykiem zakupowym

  Scenario: Dodawanie produktów do koszyka
    Given Użytkownik o imieniu "Jan" i nazwisku "Kowalski" posiada pusty koszyk
    When Użytkownik dodaje produkt "Koszulka" o cenie 29.99 PLN do koszyka
    And Użytkownik dodaje produkt "Spodnie" o cenie 99.99 PLN do koszyka
    Then W koszyku powinny być dwa produkty
    And Łączna wartość koszyka powinna wynosić 129.98 PLN

  Scenario: Usuwanie produktów z koszyka
    Given Użytkownik o imieniu "Anna" i nazwisku "Nowak" posiada koszyk z produktami
      | Nazwa       | Cena  |
      | Bluzka      | 49.99 |
      | Spódnica    | 79.99 |
    When Użytkownik usuwa produkt "Bluzka" z koszyka
    Then W koszyku powinna być tylko jedna pozycja
    And Łączna wartość koszyka powinna wynosić 79.99 PLN
