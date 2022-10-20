package io.codelex.classesandobjects.practice.Exercise10BankAccount;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return name + ", -$" + Math.abs(balance);
        } else {
            return name + ", $" + balance;
        }
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

}
