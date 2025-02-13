package map_interface.implement_shopping_cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Test_ShoppingCart {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);
    }

    @Test
    void testAddProduct() {
        cart.addProduct("Grapes", 2.0);
        cart.addToCart("Grapes", 1);
        assertFalse(cart.toString().contains("Grapes"));
    }

    @Test
    void testAddToCart() {
        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);
        assertFalse(cart.toString().contains("Apple"));
        assertFalse(cart.toString().contains("Banana"));
        assertFalse(cart.toString().contains("Orange"));
    }

    @Test
    void testDisplayCart() {
        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);
        cart.displayCart();
    }

    @Test
    void testDisplaySortedByPrice() {
        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);
        cart.displaySortedByPrice();
    }
}
