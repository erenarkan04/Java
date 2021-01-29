package com.ErenArkan.Stacks;

public class stackMain {

    public static void main(String[] args) {

    ArrayListStack employeeStack = new ArrayListStack();

    employeeStack.push(new Employee("ad", "ab", 22));
    employeeStack.push(new Employee("cd", "da", 232));
    employeeStack.push(new Employee("fs", "se", 55));

    employeeStack.printStack();

    System.out.println();

    employeeStack.pop();

    employeeStack.printStack();

    System.out.println();

    System.out.println(employeeStack.peek());

    }
}
