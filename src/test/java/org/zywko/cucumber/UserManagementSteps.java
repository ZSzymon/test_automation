package org.zywko.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class UserManagementSteps {
    private User user;

    @Given("Pusty system uzytkownika")
    public void setupEmptySystem() {
    }

    @When("Użytkownik o imieniu {string} i nazwisku {string} tworzy konto")
    public void createUser(String firstName, String lastName) {
        user = new User(firstName, lastName);
        // Tutaj można dodać logikę tworzenia konta użytkownika
    }

    @Then("Użytkownik o imieniu {string} i nazwisku {string} jest zarejestrowany")
    public void verifyUserRegistered(String firstName, String lastName) {
        assertNotNull(user);
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        // Tutaj można dodać dodatkowe sprawdzenia lub logikę weryfikacji zarejestrowanego użytkownika
    }
}
