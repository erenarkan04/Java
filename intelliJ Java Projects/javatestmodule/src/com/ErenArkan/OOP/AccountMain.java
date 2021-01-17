package com.ErenArkan.OOP;

import java.util.ArrayList;

public class AccountMain {

    public static void main(String[] args) {

////        Account testAcct = new Account(1122, 20000, 0.045);
//
//        if(testAcct.withdraw(21000)) {
//            System.out.println("Withdraw successful");
//
//        } else {System.out.println("Withdraw unsuccessful");}
//
//        testAcct.deposit(3000);
//
//        System.out.println("id: " + testAcct.getId() + ", "
//                            + "balance: " + testAcct.getBalance() + ", "
//                            + "annual rate: " + testAcct.getAnnualInterestRate() + ", "
//                            + "date created: " + testAcct.getDateCreated().toGMTString());


        Account testAcct = new Account(10, 20000, 0.05, new Client());

        ArrayList<Account> accountList = new ArrayList<>();

        accountList.add(new Account(1, 5000, 0.05, new Client()));
        accountList.add(new Account(2, 10000, 0.05, new Client()));
        accountList.add(new Account(3, 15000, 0.05, new Client()));

        accountList.get(0).deposit(1000);
        accountList.get(0).withdraw(4000);


        accountList.get(1).deposit(6000);
        accountList.get(1).withdraw(4000);


        accountList.get(2).deposit(10000);
        accountList.get(2).withdraw(9000);

        System.out.println(accountList.get(0).toString());
        System.out.println(accountList.get(0).getTransactions());

        System.out.println(accountList.get(0).toString());
        System.out.println(accountList.get(1).getTransactions());

        System.out.println(accountList.get(0).toString());
        System.out.println(accountList.get(2).getTransactions());


    }
}