package map_interface.implement_shopping_cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private HashMap<String, Double> productPrices; // Stores product prices
    private LinkedHashMap<String, Integer> cart; // Maintains order of added items

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
    }

    // Add product with price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add item to cart
    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display cart items in order of addition
    public void displayCart() {
        System.out.println("Cart Items:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
    }

    // Display items sorted by price
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (String product : cart.keySet()) {
            sortedByPrice.put(productPrices.get(product), product);
        }

        System.out.println("Items sorted by price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products with prices
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        // Adding products to cart
        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 5);
        cart.addToCart("Orange", 3);

        // Display cart items
        cart.displayCart();

        // Display items sorted by price
        cart.displaySortedByPrice();
    }
}
