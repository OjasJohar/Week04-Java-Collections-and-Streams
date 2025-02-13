package map_interface.group_objects_by_property;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_GroupObjectsByProperty_05 {
    @Test
    void invertMapTest(){
        Employees employees1=new Employees("Alice");
        Employees employees2=new Employees("Bob");
        Employees employees3=new Employees("Carol");

        Department department1=new Department("HR");
        Department department2=new Department("IT");

        Map<Employees,Department> map=new HashMap<>();
        map.put(employees1,department1);
        map.put(employees2,department2);
        map.put(employees3,department1);

        Map<Department, List<Employees>> invertMap= GroupObjectsByProperty_05.invertingMap(map);

        Map<Department, List<Employees>> expected=new HashMap<>();
        expected.put(department1, Arrays.asList(employees3,employees1));
        expected.put(department2,Arrays.asList(employees2));
        assertTrue(expected.equals(invertMap));

    }

}
