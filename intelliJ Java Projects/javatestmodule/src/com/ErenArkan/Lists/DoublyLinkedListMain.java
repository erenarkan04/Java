package com.ErenArkan.Lists;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        DoubleEmployeeLinkedList employeeDoubleList = new DoubleEmployeeLinkedList();

        Employee janejones = new Employee("Jane", "Jones", 123);
        Employee johndoe = new Employee("John", "Doe ", 456);
        Employee marysmith = new Employee("Mary", "Smith", 22);
        Employee mikewilson = new Employee("Mike", "Wilson", 4792);

        employeeDoubleList.addToFront(johndoe);
        employeeDoubleList.addToFront(marysmith);
        employeeDoubleList.addToFront(janejones);
        employeeDoubleList.addToFront(mikewilson);

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());
        System.out.println();

        employeeDoubleList.addBeforeItem(new Employee("Eren", "Arkan", 1994), new Employee("Jane", "Jones", 123));

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());
        System.out.println();

        employeeDoubleList.swapEmployees(new Employee("Eren", "Arkan", 1994), new Employee("Mary", "Smith", 22));

        employeeDoubleList.printList();
        System.out.println(employeeDoubleList.getSize());
    }
}