package com.ErenArkan.HashTables;

import java.util.HashMap;
import java.util.LinkedList;

public class hashEx2Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        removeDuplicates(employees);

        employees.forEach(e -> System.out.println(e));


    }

    public static void removeDuplicates (LinkedList<Employee> inputList) {
        HashMap<String, Employee> hashMap = new HashMap<>();
        LinkedList<String> keys = new LinkedList<>();

        for (int i = 0; i < inputList.size(); i++) {
                if (!keys.contains(inputList.get(i).getLastName())) keys.add(inputList.get(i).getLastName());
        }

        for (int i = 0; i < inputList.size(); i++) {
            hashMap.putIfAbsent(inputList.get(i).getLastName(), inputList.get(i));
        }

        inputList.clear();
        for (int i = 0; i < keys.size(); i++) {
            inputList.add(hashMap.get(keys.get(i)));
        }
    }
}