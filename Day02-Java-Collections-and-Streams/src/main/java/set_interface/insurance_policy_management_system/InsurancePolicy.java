package set_interface.insurance_policy_management_system;

import java.util.Date;

public class InsurancePolicy implements Comparable<InsurancePolicy>{
    private int policyNumber;
    private String policyHolderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(int policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getCoverageType(){
        return coverageType;
    }

    public int getPolicyNumber(){
        return policyNumber;
    }

    @Override
    public String toString() {
        return
                "policyNumber=" + policyNumber +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount
                ;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}
