package org.zywko.cucumber;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public double getTotalValue() {
        double totalValue = 0.0;
        for (Product product : products) {
            totalValue += product.getPrice();
        }
        return totalValue;
    }

    public void removeProductByName(String productName) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(productName)) {
                iterator.remove();
                break;
            }
        }
    }

}
