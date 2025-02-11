package smart_warehouse_management_system;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_SmartWareHouse_01 {

    @Test
    void test01A(){
        Electronics obj=new Electronics(34, 15);
        obj.displayDetails();
    }
    @Test
    void test01B(){
        Groceries obj=new Groceries("A34", 33);
        obj.displayDetails();
    }
    @Test
    void test01C(){
        Furniture obj=new Furniture(99, 24);
        obj.displayDetails();
    }
    @AfterAll
    static void test01D(){
        Electronics obj=new Electronics(1000, 50);

        Storage<WarehouseItem> storage=new Storage<>();
        storage.addItem(obj);

        Assertions.assertNotNull(obj, "Item Not Added, Test Unsuccessful !!");
        System.out.println("Item Added, Test Successful !!");
        storage.displayDetails();
    }
}