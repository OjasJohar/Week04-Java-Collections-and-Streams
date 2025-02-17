package junit.advanced_junit_problems.testing_password_strength_validator;

public class PasswordValidator_02 {
    public static boolean validator(String password){
        if(password.length()<8){
            return false;
        }
        int uppercase=0;
        int digit=0;
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(c<='Z'&&c>='A'){
                uppercase++;
            }
            if(c<='9'&&c>='0'){
                digit++;
            }
        }
        return (uppercase!=0&&digit!=0);
    }
}
