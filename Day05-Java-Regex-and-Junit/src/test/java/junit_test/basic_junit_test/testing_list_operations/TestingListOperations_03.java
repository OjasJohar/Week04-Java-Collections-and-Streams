package junit_test.basic_junit_test.testing_list_operations;

import junit.basic_junit_test.testing_list_operations.ListManager_03;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingListOperations_03 {
    private ListManager_03 manager;

    @BeforeEach
    void setUp(){
        manager=new ListManager_03();
        System.out.println("Test Started");
    }
    @AfterEach
    void print(){
        System.out.println("Test Completed");
    }

    @Test
    @DisplayName("Test 1: For Adding Element")
    void testAddElement(){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        manager.addElement(list, 6);
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Assertions.assertEquals(expected, list);
    }
    @Test
    @DisplayName("Test 2: For Removing Element")
    void testRemoveElement(){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        manager.removeElement(list, 3);
        List<Integer> expected=new ArrayList<>(Arrays.asList(1,2,4,5,6));
        Assertions.assertEquals(expected, list);
    }
    @Test
    @DisplayName("Test 3: For Calculating Size")
    void testSize(){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int res1=manager.getSize(list);
        Assertions.assertEquals(5, res1);
        manager.removeElement(list, 1);
        int res2=manager.getSize(list);
        Assertions.assertEquals(4, res2);
    }
}
