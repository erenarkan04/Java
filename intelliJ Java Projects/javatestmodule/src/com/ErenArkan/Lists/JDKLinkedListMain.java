package com.ErenArkan.Lists;

import java.util.LinkedList;

public class JDKLinkedListMain {
    public static void main(String[] args) {
        Employee janejones = new Employee("Jane", "Jones", 123);
        Employee johndoe = new Employee("John", "Doe ", 456);
        Employee marysmith = new Employee("Mary", "Smith", 22);
        Employee mikewilson = new Employee("Mike", "Wilson", 4792);
        Employee billend = new Employee("bill", "end", 22);


        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janejones);
        list.addFirst(johndoe);
        list.addFirst(marysmith);
        list.addFirst(mikewilson);

        System.out.println(list.toString());

        list.addLast(billend);

        System.out.println(list.toString());


        list.removeFirst();
        list.removeLast();

        System.out.println(list.toString());


    }

}
