package throw_vs_throws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThrowVsThrowsTest_06 {
    @Test
    void successfulSI(){
        double si=ThrowVsThrows_06.calculateInterest(1000,10,1);
        assertEquals(100,si);
    }
    @Test
    void negativePrinciple(){
        Exception exception=assertThrows(IllegalArgumentException.class,()->ThrowVsThrows_06.calculateInterest(-1000,10,1));
        assertEquals("Invalid input: Amount and rate must be positive",exception.getMessage());
    }
    @Test
    void negativeRate(){
        Exception exception=assertThrows(IllegalArgumentException.class,()->ThrowVsThrows_06.calculateInterest(1000,-10,1));
        assertEquals("Invalid input: Amount and rate must be positive",exception.getMessage());
    }
}
