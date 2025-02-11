package dynamic_online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class Product<T extends Category>{
    private List<T> products;

    public Product(){
        products=new ArrayList<>();
    }

    public void addProduct(T product){
        products.add(product);
    }

    public void displayProducts(){
        System.out.println("----Product Details-----");
        for(T c:products){
            System.out.println("Name      :" + c.getName());
            System.out.println("Category  :" + c.getCategory());
            System.out.println("Price     :" + c.getPrice() +" $");
            System.out.println("- - - - - - - - - - - -");
        }
    }

    public double applyDiscount(double percentage){
        double totalPrice=0;
        for(T product:products){
            totalPrice+=product.getPrice();
        }

        double discount=totalPrice/percentage;
        System.out.println("Total Price    :" + totalPrice + " $");
        System.out.println("Total Discount :" + discount + " $");
        System.out.println("Final Amount   :" + (totalPrice-discount)+ " $");

        return (totalPrice-discount);
    }
}

