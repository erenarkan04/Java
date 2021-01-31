package com.ErenArkan.HashTables;

import java.util.LinkedList;
import java.util.ListIterator;

public class chainedHashTable {

    private LinkedList<storedEmployee>[] hashTable;

    public chainedHashTable () {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<storedEmployee>();
        }
    }


    public Employee get (String key) {
        int hashedKey = hashKey(key);
//        for (int i = 0; i < hashTable[hashedKey].size(); i++) {
//            if (hashTable[hashedKey].)
//        }
        ListIterator<storedEmployee> iterator = hashTable[hashedKey].listIterator();
        storedEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) return employee.employee;
        }
        return null;
    }

    public Employee remove (String key) {
        int hashedKey = hashKey(key);

        ListIterator<storedEmployee> iterator = hashTable[hashedKey].listIterator();
        storedEmployee employee = null;
        int index = -1;

        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) break;
        }
        if (employee == null || !employee.key.equals(key)) return null;
        else {
            hashTable[hashedKey].remove(index);
            return employee.employee;
        }
    }

    public void put (String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new storedEmployee(key, employee));
    }
    private int hashKey (String key) {
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashTable () {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i].isEmpty()) System.out.println("index" + i + " is empty");

            else {
                System.out.print("position" + i + ": ");
                ListIterator<storedEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }


    }

}
