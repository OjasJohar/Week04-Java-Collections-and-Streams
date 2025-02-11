package ai_driven_resume_screening_system;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_ScreeningSystem_05 {

    @Test
    void testSoftwareEngineer(){
        SoftwareEngineer se=new SoftwareEngineer("Ojas", 4);
        Assertions.assertEquals("Ojas", se.getName());
        Assertions.assertEquals(4, se.getExperience());
    }
    @Test
    void testDataScientist(){
        DataScientist ds=new DataScientist("Ojas", 4);
        Assertions.assertEquals("Ojas", ds.getName());
        Assertions.assertEquals(4, ds.getExperience());
    }
    @Test
    void testProductManager(){
        ProductManager pm=new ProductManager("Ojas", 4);
        Assertions.assertEquals("Ojas", pm.getName());
        Assertions.assertEquals(4, pm.getExperience());
    }
    @Test
    void testResume(){
        SoftwareEngineer se=new SoftwareEngineer("Ojas", 4);
        Resume<SoftwareEngineer> resume=new Resume<>(se);

        Assertions.assertNotNull(resume);
    }

    @Test
    void testJobRole(){
        SoftwareEngineer se=new SoftwareEngineer("Ojas", 4);
        List<JobRole> resume=new ArrayList<>();

        Assertions.assertTrue(resume.isEmpty());

        resume.add(se);
        Assertions.assertFalse(resume.isEmpty());
    }
}
