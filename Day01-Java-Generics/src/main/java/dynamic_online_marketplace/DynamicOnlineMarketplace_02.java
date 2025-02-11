package dynamic_online_marketplace;

public class DynamicOnlineMarketplace_02 {

    public static void main(String[] args) {
        Product<Category> products=new Product<>();
        products.addProduct(new Books("Java", 500));
        products.addProduct(new Gadgets("Smart-Watch",2500));
        products.addProduct(new Clothing("Pants",1100));
        products.displayProducts();
        products.applyDiscount(10);
    }
}
