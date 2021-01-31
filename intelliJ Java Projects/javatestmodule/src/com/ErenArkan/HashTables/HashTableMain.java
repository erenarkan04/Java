package com.ErenArkan.HashTables;

import com.ErenArkan.Lists.Employee;

public class HashTableMain {

    public static void main(String[] args) {

        com.ErenArkan.HashTables.Employee janejones = new com.ErenArkan.HashTables.Employee("Jane", "Jones", 123);
        com.ErenArkan.HashTables.Employee johndoe = new com.ErenArkan.HashTables.Employee("John", "Doe", 456);
        com.ErenArkan.HashTables.Employee mikewilson = new com.ErenArkan.HashTables.Employee("Mike", "Wilson", 4792);
        com.ErenArkan.HashTables.Employee marysmith = new com.ErenArkan.HashTables.Employee("Mary", "Smith", 22);

        chainedHashTable ht = new chainedHashTable();

        ht.put(janejones.getLastName(), janejones);
        ht.put(johndoe.getLastName(), johndoe);
        ht.put(marysmith.getLastName(), marysmith);
        ht.put(mikewilson.getLastName(), mikewilson);

        ht.printHashTable();

        System.out.println();

        ht.remove("Wilson");
        ht.remove("Jones");

        ht.printHashTable();

        System.out.println();
        System.out.println(ht.get("Smith"));
    }
}
