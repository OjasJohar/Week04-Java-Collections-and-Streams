package smart_warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> list;

    public Storage(){
        this.list=new ArrayList<>();
    }

    public void addItem(T item){
        list.add(item);
    }

    public void displayDetails(){
        System.out.println("-----Warehouse Items-----");
        if(list.isEmpty()){
            System.out.println("  Storage is empty !!");
            System.out.println("------------------------");
        }
        for(WarehouseItem w : list){
            w.displayDetails();
        }
    }
}
