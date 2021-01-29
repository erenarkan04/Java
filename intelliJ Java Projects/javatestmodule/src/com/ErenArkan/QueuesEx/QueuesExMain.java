package com.ErenArkan.QueuesEx;

import com.ErenArkan.Queues.ArrayQueue;
import com.ErenArkan.Stacks.ArrayStack;

import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class QueuesExMain {

    public static void main(String[] args) {

        System.out.println( isPalindrome("abccba"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println( isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome (String input) {
        String inputLowerCase = input.toLowerCase(Locale.ROOT);
        ArrayDeque<Character> queue = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputLowerCase.length(); i++) {
            if (inputLowerCase.charAt(i) <= 'z' && inputLowerCase.charAt(i) >= 'a') {
                queue.addLast(inputLowerCase.charAt(i));
                stack.push(inputLowerCase.charAt(i));
            }
        }

        for (int i = 0; i < queue.size(); i++) {
            if (queue.removeFirst() != stack.pop()) return false;
        }

        return  true;
    }
}