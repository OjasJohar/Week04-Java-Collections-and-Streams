package junit_test.advanced_junit_problems.testing_banking_transactions;

import junit.advanced_junit_problems.testing_banking_transactions.BankAccount_01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestingBankAccount_01 {
    private BankAccount_01 account;

    @BeforeEach
    void setUp() {
        account = new BankAccount_01(100.0); // Initial balance
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated after deposit");
    }

    @Test
    void testWithdrawSufficientFunds() {
        boolean result = account.withdraw(40.0);
        assertTrue(result, "Withdrawal should succeed when sufficient funds exist");
        assertEquals(60.0, account.getBalance(), "Balance should be updated correctly after withdrawal");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(200.0);
        assertFalse(result, "Withdrawal should fail when insufficient funds");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged after failed withdrawal");
    }

    @Test
    void testNegativeDeposit() {
        account.deposit(-10.0);
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged for negative deposit");
    }

    @Test
    void testNegativeWithdrawal() {
        boolean result = account.withdraw(-20.0);
        assertFalse(result, "Negative withdrawal should fail");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged for negative withdrawal");
    }
}