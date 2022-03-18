package io.codelex.classesandobjects.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccount {
    private final double interestRate;
    private double balance;
    private double interestEarnedAmount;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = input.nextDouble();

        System.out.print("Enter the annual interest rate?: ");
        double interestRate = input.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(balance, interestRate);

        System.out.print("How long has the account been opened?: ");
        int months = input.nextInt();

        double totalDeposit = 0;
        double totalWithdrawn = 0;
        double monthDeposit;
        double monthWithdrawn;
        double totalInterest = 0;

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            monthDeposit = input.nextDouble();
            totalDeposit += monthDeposit;

            savingsAccount.deposit(monthDeposit);

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            monthWithdrawn = input.nextDouble();
            totalWithdrawn += monthWithdrawn;

            savingsAccount.withdraw(monthWithdrawn);

            savingsAccount.addInterest();
            totalInterest += savingsAccount.getInterestEarnedAmount();


        }

        DecimalFormat currency = new DecimalFormat("#,##0.00");

        System.out.println("Total deposited: " + currency.format(totalDeposit));
        System.out.println("Total withdrawn: " + currency.format(totalWithdrawn));
        System.out.println("Interest earned: " + currency.format(totalInterest));
        System.out.println("Ending balance: " + currency.format(savingsAccount.getBalance()));

    }

    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void addInterest() {
        double monthlyInterest = interestRate / 12;
        interestEarnedAmount = monthlyInterest * balance;
        balance += interestEarnedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestEarnedAmount() {
        return interestEarnedAmount;
    }
}

