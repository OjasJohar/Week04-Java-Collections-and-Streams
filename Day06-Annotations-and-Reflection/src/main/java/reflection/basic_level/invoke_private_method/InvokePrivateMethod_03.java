package reflection.basic_level.invoke_private_method;

import java.lang.reflect.Method;

public class InvokePrivateMethod_03 {

    public static void main(String[] args) throws Exception {
        int a=2,b=2;
        Calculator calc=new Calculator();
        int res=InvokePrivateMethod(calc, a, b);
        System.out.println("Result :"+res);
    }

    public static int InvokePrivateMethod(Object calc, int a, int b) throws Exception {
        Class<?> cls=calc.getClass();
        Method m=cls.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);

        int res=(int)m.invoke(calc, a, b);
        return res;
    }
}
