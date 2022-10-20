package io.codelex.classesandobjects.practice.Exercise8SavingsAccount;

public class SavingsAccount {
    private int balance;
    static private double annualRate;

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    public void addInterest(double sum) {
        this.balance += sum;
    }


    public void addMoney(int sum) {
        this.balance += sum;
    }

    public void withdrawMoney(int sum) {
        this.balance -= sum;
    }

}

