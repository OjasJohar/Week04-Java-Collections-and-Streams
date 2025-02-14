package bank_transaction_system;

public class BankTransactionSystem_10 {
    private double balance;
    public BankTransactionSystem_10(int balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException,
            IllegalArgumentException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }else if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }else{
            balance=balance-amount;
            System.out.println("Withdrawal successful, new balance: " + balance + ".");
        }
    }

    public static void main(String[] args) {
        BankTransactionSystem_10 account=new BankTransactionSystem_10(1000);
        try{account.withdraw(-1);
        }catch(IllegalArgumentException | InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
