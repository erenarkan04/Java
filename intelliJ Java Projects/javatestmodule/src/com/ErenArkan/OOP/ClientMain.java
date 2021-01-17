package com.ErenArkan.OOP;

import java.util.ArrayList;

public class ClientMain {

    public static void main (String [] args) {

        ArrayList<Client> clientList = new ArrayList<>();

        clientList.add(new Client(1, "client1", "123"));
        clientList.add(new Client(2, "client2", "456"));

//
//        clientList.get(0).addAccount(new Account(12, 20000, 0.045));
//        clientList.get(0).addAccount(new Account(13, 15000, 0.5));
//        clientList.get(1).addAccount(new Account(14, 15000, 0.5));
//        clientList.get(1).addAccount(new Account(15, 15000, 0.5));
//        clientList.get(1).addAccount(new Account(16, 15000, 0.5));


        System.out.println(clientList);


    }
}
