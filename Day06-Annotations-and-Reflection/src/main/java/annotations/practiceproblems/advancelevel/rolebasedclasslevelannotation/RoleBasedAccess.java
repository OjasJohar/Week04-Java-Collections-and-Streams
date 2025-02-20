package annotations.practiceproblems.advancelevel.rolebasedclasslevelannotation;

public class RoleBasedAccess {
    public static void main(String[] args) {
        Service service = new Service();

        // Simulating different user roles
        System.out.println("Attempting as ADMIN:");
        AccessManager.checkAccess(service, "performAdminTask", "ADMIN");

        System.out.println("\nAttempting as USER:");
        AccessManager.checkAccess(service, "performAdminTask", "USER");

        System.out.println("\nAttempting as USER for User Task:");
        AccessManager.checkAccess(service, "performUserTask", "USER");

        System.out.println("\nAttempting as GUEST:");
        AccessManager.checkAccess(service, "performUserTask", "GUEST");

        System.out.println("\nAttempting Public Task as GUEST:");
        AccessManager.checkAccess(service, "publicTask", "GUEST");
    }
}
