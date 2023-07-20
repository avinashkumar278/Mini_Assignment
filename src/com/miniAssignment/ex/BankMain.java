package com.miniAssignment.ex;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 2.5);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.interestCalculation();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        currentAccount.withdraw(1000);
        currentAccount.interestCalculation(); // No interest for current account
    }
}