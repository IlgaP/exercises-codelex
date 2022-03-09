package io.codelex.classesandobjects.practice;

public class AccountProgram {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        System.out.println("=======================================");

        Account mattsAccount = new Account("Matt`s Account", 1000);
        Account myAccount = new Account("My Account", 0);
        System.out.println("Matt`s Account balance: "+ mattsAccount.balance());
        System.out.println("My Account balance: "+ myAccount.balance());
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println("Matt`s Account balance: "+ mattsAccount.balance());
        System.out.println("My Account balance: "+ myAccount.balance());

        System.out.println("=======================================");

        Account accountA = new Account("AccountA", 100);
        Account accountB = new Account("AccountB", 0);
        Account accountC = new Account("AccountC", 0);
        Account.transfer(accountA,accountB,50);
        Account.transfer(accountB, accountC, 25);
        System.out.println("Accounts A balance: "+ accountA.balance());
        System.out.println("Accounts B balance: "+ accountB.balance());
        System.out.println("Accounts C balance: "+ accountC.balance());




    }

}
