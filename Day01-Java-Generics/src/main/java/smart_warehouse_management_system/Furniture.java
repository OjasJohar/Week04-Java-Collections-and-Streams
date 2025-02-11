package smart_warehouse_management_system;

public class Furniture extends WarehouseItem{
    private int itemID;
    private int quantity;

    public Furniture(int itemID, int quantity){
        setItemID(itemID);
        setQuantity(quantity);
    }

    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
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
        System.out.println("--3. Item Details--");
        System.out.println("Item ID  :"+getItemID());
        System.out.println("Quantity :"+getQuantity());
        System.out.println("-------------------");
    }
}
