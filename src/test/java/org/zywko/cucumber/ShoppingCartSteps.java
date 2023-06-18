package org.zywko.cucumber;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class ShoppingCartSteps {
    private User user;
    private ShoppingCart cart;

    @DataTableType
    public Product createProduct(Map<String, String> entry) {
        String name = entry.get("Nazwa");
        double price = Double.parseDouble(entry.get("Cena"));
        return new Product(name, price);
    }

    @Given("Użytkownik o imieniu {string} i nazwisku {string} posiada pusty koszyk")
    public void setupEmptyCart(String firstName, String lastName) {
        user = new User(firstName, lastName);
        cart = new ShoppingCart();
    }

    @When("Użytkownik dodaje produkt {string} o cenie {double} PLN do koszyka")
    public void addToCart(String productName, double price) {
        Product product = new Product(productName, price);
        cart.addProduct(product);
    }

    @Then("W koszyku powinny być {int} produkty")
    public void verifyCartProductCount(int expectedCount) {
        assertEquals(expectedCount, cart.getNumberOfProducts());
    }

    @Then("Łączna wartość koszyka powinna wynosić {double} PLN")
    public void verifyCartTotalValue(double expectedTotalValue) {
        assertEquals(expectedTotalValue, cart.getTotalValue(), 0.01);
    }

    @Given("Użytkownik o imieniu {string} i nazwisku {string} posiada koszyk z produktami")
    public void setupCartWithProducts(String firstName, String lastName, List<Product> products) {
        user = new User(firstName, lastName);
        cart = new ShoppingCart();
        for (Product product : products) {
            cart.addProduct(product);
        }
    }

    @When("Użytkownik usuwa produkt {string} z koszyka")
    public void removeFromCart(String productName) {
        cart.removeProductByName(productName);
    }

    @Then("W koszyku powinna być tylko jedna pozycja")
    public void verifyCartHasSingleItem() {
        assertEquals(1, cart.getNumberOfProducts());
    }

    @Then("W koszyku powinny być dwa produkty")
    public void wKoszykuPowinnyByćDwaProdukty() {
        assertEquals(2, cart.getNumberOfProducts());
    }
}
