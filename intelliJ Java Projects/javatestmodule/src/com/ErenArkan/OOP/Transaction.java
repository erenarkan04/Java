package com.ErenArkan.OOP;

import java.util.Date;

public class Transaction {

    private char type;
    private double amount;
    private double balance;
    private Date dateCreated;
    private String description;

    Transaction(char type, double amount, double balance, String description) {
        this.dateCreated = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                ", description='" + description + '\'' +
                '}';
    }
}
