Feature: Zarządzanie produktami

  Scenario: Tworzenie nowego produktu
    Given Pusty system produktu
    When Administrator dodaje produkt "Koszulka" o cenie 29.99 PLN
    Then Produkt "Koszulka" o cenie 29.99 PLN istnieje w systemie
