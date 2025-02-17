package regex_test.advanced_problems_test.validate_an_ip_address_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.validate_an_ip_address.ValidateAnIPAddress_10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateAnIPAddressTest_10 {
    @Test
    void testCase1(){
        String ipAddress="192.168.1.1";
        boolean isValid= ValidateAnIPAddress_10.validatingIpAddress(ipAddress);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String ipAddress="256.100.100.100";
        boolean isValid=ValidateAnIPAddress_10.validatingIpAddress(ipAddress);
        assertFalse(isValid);
    }

}
