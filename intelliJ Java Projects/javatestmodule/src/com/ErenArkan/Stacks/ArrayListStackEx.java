package com.ErenArkan.Stacks;

import java.util.LinkedList;
import java.util.Locale;

public class ArrayListStackEx {

    private LinkedList<Character> stack;

    public ArrayListStackEx(String input) {

        stack = new LinkedList<Character>();
    }

    public void push (char employee) {
        stack.push(employee);
    }

    public char pop() {
        return stack.pop();
    }

    public char peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack () {
        System.out.println(stack.toString());
    }

    public int getSize () {
        return stack.size();
    }

}
