Feature: Zarządzanie użytkownikami

  Scenario: Tworzenie nowego użytkownika
    Given Pusty system uzytkownika
    When Użytkownik o imieniu "Jan" i nazwisku "Kowalski" tworzy konto
    Then Użytkownik o imieniu "Jan" i nazwisku "Kowalski" jest zarejestrowany
