package com.ErenArkan.HashTables;

public class SimpleHashTable {

    private storedEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new storedEmployee[10];
    }

    public void put (String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) hashedKey = 0;
            else hashedKey++;

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) System.out.println("index full at position " + hashedKey);
        else hashtable[hashedKey] = new storedEmployee(key, employee);
    }

    public Employee get (String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) return null;
        return hashtable[hashedKey].employee;
    }

    public Employee remove (String key) {
        int hashedKey = findKey(key);
        if (hashedKey == - 1) return null;

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        storedEmployee[] oldHashTable = hashtable;
        hashtable = new storedEmployee[oldHashTable.length];

        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    private int findKey (String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) hashedKey = 0;
        else hashedKey++;

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) return hashedKey;
        else return - 1;

    }

    private int hashKey (String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable () {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) System.out.println("position" + " " + i + ": " + "empty");
            else System.out.println("position" + " " + i + ": " + hashtable[i].employee);
        }
    }

    public boolean isOccupied (int index) {
        return hashtable[index] != null;
    }
}
