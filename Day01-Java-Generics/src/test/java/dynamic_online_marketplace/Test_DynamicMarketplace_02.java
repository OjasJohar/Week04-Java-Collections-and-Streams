package dynamic_online_marketplace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_DynamicMarketplace_02 {
    @Test
    void test02(){
        Product<Category> products=new Product<>();
        products.addProduct(new Gadgets("AirPods", 4100));

        double finalAmount=products.applyDiscount(10);
        Assertions.assertEquals(3690, finalAmount);
    }

    @Test
    void test02A(){
        Product<Category> product=new Product<>();
        Books books=new Books("Java", 500);
        product.addProduct(books);

        Assertions.assertNotNull(product, "Product Not Added.");
        System.out.println("Product Added !!");
    }
    @Test
    void test02B(){
        Product<Category> product=new Product<>();
        Gadgets gadgets=new Gadgets("Mobile", 5000);
        product.addProduct(gadgets);

        Assertions.assertNotNull(product, "Product Not Added.");
        System.out.println("Product Added !!");
    }
    @Test
    void test02C(){
        Product<Category> product=new Product<>();
        Clothing clothing=new Clothing("Shirts", 500);
        product.addProduct(clothing);

        Assertions.assertNotNull(product, "Product Not Added.");
        System.out.println("Product Added !!");
    }
    @Test
    void test02D(){
        Product<Category> products=new Product<>();
        products.addProduct(new Gadgets("AirPods", 12000));
        products.displayProducts();
    }
}
