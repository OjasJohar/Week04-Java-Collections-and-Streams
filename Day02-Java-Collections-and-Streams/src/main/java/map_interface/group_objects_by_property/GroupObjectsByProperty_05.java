package map_interface.group_objects_by_property;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsByProperty_05{

    public static Map<Department, List<Employees>> invertingMap(Map<Employees,Department> map){
        Map<Department,List<Employees>> invertMap=new HashMap<>();
        for(Map.Entry<Employees,Department> m:map.entrySet()){
            Employees key=m.getKey();
            Department value=m.getValue();

            List<Employees> list=new ArrayList<>();
            if(invertMap.containsKey(value)){
               for(Employees e:invertMap.get(value)){
                   list.add(e);
               }
            }
            list.add(key);
            invertMap.put(value,list);
        }
        return invertMap;
    }

    public static void display(Map<Department,List<Employees>> map){

        for(Map.Entry<Department,List<Employees>> m:map.entrySet()){
            String key=m.getKey().getDepartment();
            List<Employees> value=m.getValue();
            System.out.print(key + " = [" );
            for(Employees e:value){
                System.out.print(e.getName() +", ");
            }
            System.out.println("\b\b]");
        }
    }

    public static void main(String[] args) {
        Employees employees1=new Employees("Alice");
        Employees employees2=new Employees("Bob");
        Employees employees3=new Employees("Carol");

        Department department1=new Department("HR");
        Department department2=new Department("IT");

        Map<Employees,Department> map=new HashMap<>();
        map.put(employees1,department1);
        map.put(employees2,department2);
        map.put(employees3,department1);

        Map<Department,List<Employees>> invertMap=invertingMap(map);
        System.out.print("Original map : [");
        for(Map.Entry<Employees,Department> m:map.entrySet()){
            String key=m.getKey().getName();
            String value=m.getValue().getDepartment();
            System.out.print(key + " = [" + value + "],");
        }
        System.out.println("\b]");
        System.out.println("Inverted map : ");
        display(invertMap);
    }
}
