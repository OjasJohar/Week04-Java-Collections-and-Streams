package dynamic_online_marketplace;

public class Category {
    private String type;
    private String name;
    private double price;

    public Category(String type,String name, double price){
        this.type=type;
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return type;
    }
}