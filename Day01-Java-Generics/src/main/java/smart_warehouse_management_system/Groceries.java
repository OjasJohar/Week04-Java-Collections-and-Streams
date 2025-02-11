package smart_warehouse_management_system;

public class Groceries extends WarehouseItem{
    private String itemID;
    private int quantity;

    public Groceries(String itemID, int quantity){
        setItemID(itemID);
        setQuantity(quantity);
    }
    public String getItemID() {
        return itemID;
    }
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    @Override
    void displayDetails() {
        System.out.println("--2. Item Details--");
        System.out.println("Item ID  :"+getItemID());
        System.out.println("Quantity :"+getQuantity());
        System.out.println("-------------------");
    }
}
