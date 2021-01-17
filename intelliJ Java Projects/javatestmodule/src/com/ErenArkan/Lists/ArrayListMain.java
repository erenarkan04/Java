package com.ErenArkan.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe ", 456));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 4792));

//        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.get(2));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("john", "adams", 3465));

//        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 1563));

//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 1563)));

        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee));






    }
}
