package map_interface.implement_banking_system;

import java.util.*;

public class BankingSystem {
    private final HashMap<Integer, Double> accounts = new HashMap<>();
    private final TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private final Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double oldBalance = accounts.get(accountNumber);
            sortedAccounts.remove(oldBalance);
            double newBalance = oldBalance + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for account: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.containsKey(accountNumber)) {
                double balance = accounts.get(accountNumber);
                double withdrawalAmount = Math.min(100, balance); // Example: withdraw up to 100 per request
                if (withdrawalAmount > 0) {
                    sortedAccounts.remove(balance);
                    double newBalance = balance - withdrawalAmount;
                    accounts.put(accountNumber, newBalance);
                    sortedAccounts.put(newBalance, accountNumber);
                    System.out.println("Withdrawn " + withdrawalAmount + " from account " + accountNumber);
                } else {
                    System.out.println("Insufficient balance in account " + accountNumber);
                }
            }
        }
    }

    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " - Balance: " + entry.getKey());
        }
    }

    public double getBalance(int accountNumber){
        return accounts.get(accountNumber);
    }


    //public class BankingSystem {
    public static void main(String[] args) {
        BankingSystem bank= new BankingSystem();
        bank.createAccount(1001, 500.0);
        bank.createAccount(1002, 1500.0);
        bank.createAccount(1003, 300.0);

        bank.deposit(1001, 200.0);
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1003);
        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }

}
