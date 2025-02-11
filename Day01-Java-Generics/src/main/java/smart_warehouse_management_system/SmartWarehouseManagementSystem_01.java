package smart_warehouse_management_system;

public class SmartWarehouseManagementSystem_01 {

    public static void main(String[] args) {
        Storage<WarehouseItem> storage=new Storage<>();
        storage.displayDetails();

        System.out.println("Adding Items :");
        Electronics storage1=new Electronics(101, 5);
        storage.addItem(storage1);

        Groceries storage2=new Groceries("102", 3);
        storage.addItem(storage2);

        Furniture storage3=new Furniture(103, 4);
        storage.addItem(storage3);

        storage.displayDetails();
    }
}
