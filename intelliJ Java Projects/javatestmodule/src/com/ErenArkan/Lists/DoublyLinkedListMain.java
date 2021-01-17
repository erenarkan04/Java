package com.ErenArkan.Lists;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        Employee janejones = new Employee("Jane", "Jones", 123);
        Employee johndoe = new Employee("John", "Doe ", 456);
        Employee marysmith = new Employee("Mary", "Smith", 22);
        Employee mikewilson = new Employee("Mike", "Wilson", 4792);

        DoubleEmployeeLinkedList employeeDoubleList = new DoubleEmployeeLinkedList();

        employeeDoubleList.addToFront(janejones);
        employeeDoubleList.addToFront(johndoe);
        employeeDoubleList.addToFront(marysmith);
        employeeDoubleList.addToFront(mikewilson);

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        employeeDoubleList.addToEnd(billEnd);

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());

        employeeDoubleList.removeFromFront();

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());

        employeeDoubleList.addBeforeItem(new Employee("Eren", "Arkan", 1994), new Employee("Jane", "Jones", 123));

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());

    }
}