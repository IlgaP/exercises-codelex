package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public static void main(String[] args) {

        BankAccount benben = new BankAccount("Benson", -17.5);
        System.out.println(benben.toString());
    }

    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString(){
        String str = name + ", ";
        if(balance<0){
            str += "-";
        }
        return str += "$"+ String.format("%.2f",Math.abs(balance));
    }

}
