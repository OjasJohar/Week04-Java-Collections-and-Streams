package annotations.practiceproblems.advancelevel.rolebasedclasslevelannotation;

import java.lang.reflect.Method;

public class AccessManager {
    public static void checkAccess(Object obj, String methodName, String userRole) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);


                if (roleAllowed.value().equals(userRole)) {
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! " + userRole + " is not allowed to execute " + methodName);
                }
            } else {

                System.out.println("No Role Restriction: Executing " + methodName);
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
