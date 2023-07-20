package com.miniAssignment.ex;

public class SavingsAccount implements Bank{
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }

    }
    @Override
    public void interestCalculation() {
        double interestAmount = balance * interestRate / 100;
        balance += interestAmount;
        System.out.println("Interest Calculated: $" + interestAmount);
        System.out.println("Current Balance (After Interest): $" + balance);
    }
}
