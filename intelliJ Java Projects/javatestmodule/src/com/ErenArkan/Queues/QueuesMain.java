package com.ErenArkan.Queues;

import com.ErenArkan.Stacks.ArrayListStack;

public class QueuesMain {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.add(new Employee("a", "b", 34));
        arrayQueue.add(new Employee("c", "d", 54));
        arrayQueue.remove();
        arrayQueue.add(new Employee("e", "f", 85));
        arrayQueue.remove();
        arrayQueue.add(new Employee("g", "h", 44));
        arrayQueue.remove();
        arrayQueue.add(new Employee("i", "j", 26));
        arrayQueue.remove();
        arrayQueue.add(new Employee("k", "l", 87));
        arrayQueue.add(new Employee("k", "l", 87));
        arrayQueue.add(new Employee("k", "l", 87));
        arrayQueue.add(new Employee("k", "l", 87));
        arrayQueue.add(new Employee("k", "l", 87));

        arrayQueue.printArrayQueue();

        System.out.println();


    }
}
