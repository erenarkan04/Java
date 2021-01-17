package com.ErenArkan.OOP;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;

    Account (int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.client = client;
        this.transactions = new ArrayList<>();
    }

    void deposit (double depositAmount) {
        balance += depositAmount;
        transactions.add(new Transaction('D', depositAmount, balance, "xxx"));
    }

    boolean withdraw (double withdrawAmount) {
        if (balance < withdrawAmount) return false;
        balance -= withdrawAmount;
        transactions.add(new Transaction('W', withdrawAmount, balance, "xxx"));
        return true;
    }

    public String toString() {
        return "id: " + id + ", " + "balance: " + balance + ", " + "annual rate: " + annualInterestRate + ", " + "date created: " + dateCreated + "\n" +
                transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getTransactions() {
        return transactions.toString();
    }
}

