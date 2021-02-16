package com.ErenArkan.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println('a');
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer nine = 9;

        LinkedList list = new LinkedList();

//        list.addToFront(1);
//        list.addToFront(2);
//        list.addToFront(3);
//        list.printList();
//
//
//        list.addAfter(5, 1);
//        list.printList();
//
//        list.addBefore(9, 3);
//        list.printList();
//
//        list.addToEnd(22);
//        list.printList();
//
//        System.out.println("------------------------------");

        list.insertSorted(one);
        list.printList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(25);
        list.printList();
        list.insertSorted(nine);
        list.printList();
    }
}