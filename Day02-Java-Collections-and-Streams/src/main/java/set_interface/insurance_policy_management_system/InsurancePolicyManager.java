package set_interface.insurance_policy_management_system;

import java.util.*;

public class InsurancePolicyManager {
    public Set<InsurancePolicy> hashSet=new HashSet<>();
    public Set<InsurancePolicy> linkedHashSet=new LinkedHashSet<>();
    public Set<InsurancePolicy> treeSet=new TreeSet<>();

    public void addPolicy(InsurancePolicy policy){
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies(){
        System.out.println("Policies : ");
        for(InsurancePolicy policy:hashSet){
            System.out.println(policy.toString());
        }
        System.out.println();
    }

    public void displaySpecificCoveragePolicies(String coverage){
        System.out.println("Coverage Type : " + coverage);
        for(InsurancePolicy policy:hashSet){
            if(policy.getCoverageType().equals(coverage)){
                System.out.println(policy);
            }
        }
        System.out.println();
    }

    public void displayDuplicatePolicies(){
        Map<Integer,Integer> duplicate=new HashMap<>();
        for(InsurancePolicy policy: hashSet){
            int key=policy.getPolicyNumber();
            duplicate.put(key,duplicate.getOrDefault(key,0)+1);
        }

        System.out.println("Duplicate policies : ");
        boolean found=false;
        for (Map.Entry<Integer,Integer> m: duplicate.entrySet()){
            if(m.getValue()>1){
                System.out.println("Policy number " + m.getKey() + " is duplicate");
                found=true;
            }
        }
        if(!found){
            System.out.println("No duplicate policy found");
        }
        System.out.println();
    }

    public void displayExpiringPolicies() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date threshold = cal.getTime();

        System.out.println("Policies Expiring Within 30 Days:");
        for (InsurancePolicy policy : treeSet) {
            if (policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 10);
        manager.addPolicy(new InsurancePolicy(1001, "John Doe", cal.getTime(), "Health", 5000));

        cal.set(2025, Calendar.FEBRUARY, 20);
        manager.addPolicy(new InsurancePolicy(1002, "Jane Smith", cal.getTime(), "Auto", 3000));

        cal.set(2025, Calendar.MARCH, 5);
        manager.addPolicy(new InsurancePolicy(1003, "Alice Brown", cal.getTime(), "Home", 4500));

        manager.displayAllPolicies();
        manager.displayExpiringPolicies();
        manager.displaySpecificCoveragePolicies("Health");
        manager.displayDuplicatePolicies();
    }


}
