package com.ErenArkan.Lists;

public class SingleLinkedListMain {

    public static void main(String[] args) {

        SingleEmployeeLinkedList list = new SingleEmployeeLinkedList();

        Employee janejones = new Employee("Jane", "Jones", 123);
        Employee johndoe = new Employee("John", "Doe ", 456);
        Employee marysmith = new Employee("Mary", "Smith", 22);
        Employee mikewilson = new Employee("Mike", "Wilson", 4792);


        System.out.println(list.isEmpty());

        list.addToFront(janejones);
        list.addToFront(johndoe);
        list.addToFront(marysmith);
        list.addToFront(mikewilson);

        list.printList();

        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println(list.getSize());


    }

}