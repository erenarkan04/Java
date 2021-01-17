package com.ErenArkan.OOP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts = new ArrayList<>();


    Client() {
        this.id = 1;
        this.name = "placeholder";
        this.phone = "XXXXX";
    }
    Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public boolean addAccount(Account acctToAdd) {
        accounts.add(acctToAdd);
        return true;
    }

    public boolean removeAccount(int acctIdToRemove) {
        for (Account account : accounts) {
            if (account.getId() == acctIdToRemove) {
                accounts.remove(acctIdToRemove);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String output = id + " " + name + " " + phone +  " " + "\n";

        for (Account account : accounts) {
            output += account + "\n";
        }
        return output;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
