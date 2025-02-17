package regex.advanced_problems.validate_an_ip_address;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnIPAddress_10 {
    public static boolean validatingIpAddress(String ipAddress){
        String regex= "^((1?[0-9][0-9]?|25[0-5]|2[0-4][0-9])\\.){3}(1?[0-9][0-9]?|25[0-5]|2[0-4][0-9])$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(ipAddress);

        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the IP Address:");
        String ipAddress=scn.next();

        boolean isValid=validatingIpAddress(ipAddress);
        if(isValid){
            System.out.println("IP Address :" + ipAddress + ", is valid");
        }else{
            System.out.println("IP Address :" + ipAddress + ", is not valid");
        }
        scn.close();
    }
}

/*
         "192.168.1.1",  // Valid
         "255.255.255.255", // Valid
         "0.0.0.0", // Valid
         "256.100.100.100", // Invalid
         "192.168.1", // Invalid
         "192.168.1.256", // Invalid
         "abc.def.gha.bcd" // Invalid
*/