package com.ErenArkan.Stacks;

import java.util.Locale;

public class StacksEx {


    public static void main(String[] args) {


        System.out.println( isPalindrome("abccba"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println( isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Don't nod"));


    }

    public static boolean isPalindrome(String input) {

        boolean ispalindrome = true;

        String inputLC = input.toLowerCase(Locale.ROOT);
        ArrayListStackEx charList = new ArrayListStackEx(input);
        ArrayListStackEx charListReverse = new ArrayListStackEx(input);

        for (int i = 0; i < inputLC.length(); i++) {
            if (inputLC.charAt(i)  >= 'a' && inputLC.charAt(i) <= 'z') {
                charList.push(inputLC.charAt(i));
            }
        }

        for (int i = inputLC.length() - 1; i >= 0; i--) {
            if (inputLC.charAt(i)  >= 'a' && inputLC.charAt(i) <= 'z') {
                charListReverse.push(inputLC.charAt(i));
            }
        }

        for (int i = 0; i < charList.getSize(); i++) {
            if (charList.pop() == charListReverse.pop()) continue;
            ispalindrome = false;
        }
        return ispalindrome;
    }

}


