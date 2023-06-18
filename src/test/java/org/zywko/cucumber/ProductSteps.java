package org.zywko.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class ProductSteps {
    private Product product;

    @When("Administrator dodaje produkt {string} o cenie {double} PLN")
    public void addProduct(String productName, double price) {
        product = new Product(productName, price);
    }

    @Then("Produkt {string} o cenie {double} PLN istnieje w systemie")
    public void verifyProductExists(String productName, double price) {
        assertNotNull(product);
        assertEquals(productName, product.getName());
        assertEquals(price, product.getPrice(), 0.01);
    }

    @Given("Pusty system produktu")
    public void pustySystemProduktu() {
    }
}
