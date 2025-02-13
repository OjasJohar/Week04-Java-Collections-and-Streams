package map_interface.implement_banking_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_BankingSystem{
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();
        bank.createAccount(1001, 500.0);
        bank.createAccount(1002, 1500.0);
        bank.createAccount(1003, 300.0);
    }

    @Test
    void testDeposit() {
        bank.deposit(1001, 200.0);
        assertEquals(700.0, bank.getBalance(1001), "Deposit failed");
    }

    @Test
    void testWithdrawalRequestAndProcessing() {
        bank.requestWithdrawal(1001);
        bank.processWithdrawals();
        assertEquals(400.0, bank.getBalance(1001), "Withdrawal processing failed");
    }
}
