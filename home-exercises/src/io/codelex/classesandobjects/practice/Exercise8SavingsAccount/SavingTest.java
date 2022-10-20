package io.codelex.classesandobjects.practice.Exercise8SavingsAccount;

import java.util.Scanner;

public class SavingTest {
    public static void main(String[] args) {
        SavingsAccount newAcc = getData();
        System.out.println("Enter the annual rate! ");
        Scanner in = new Scanner(System.in);
        double rate = in.nextDouble();
        System.out.println("For how many months the account has been opened: ");
        int months = in.nextInt();
        int totalDeposit = 0;
        int totalWithdrawn = 0;
        int currentDep = 0;
        int currentWithdraw = 0;
        int totalInterest = 0;


        for (int i = 1; i <= months; i++) {
            System.out.println("Enter the amount deposited for month number " + i);
            currentDep = in.nextInt();
            totalDeposit += currentDep;
            newAcc.addMoney(currentDep);
            System.out.println("Enter the amount withdrawn for month number " + i);
            currentWithdraw = in.nextInt();
            totalWithdrawn += currentWithdraw;
            newAcc.withdrawMoney(currentWithdraw);
            totalInterest += newAcc.getBalance() * (rate / 100) / 12;
            newAcc.addInterest(newAcc.getBalance() / 12);

        }
        System.out.println("Total Deposited: " + totalDeposit);
        System.out.println("Total Withdrawn: " + totalWithdrawn);
        System.out.println("Interest Earned: " + totalInterest);
        System.out.println("Ending balance: " + newAcc.getBalance());

    }


    private static SavingsAccount getData() {
        Scanner in = new Scanner(System.in);
        int startingBalance;
        System.out.println("Enter the starting balance: ");
        startingBalance = in.nextInt();
        return new SavingsAccount(startingBalance);
    }
}
