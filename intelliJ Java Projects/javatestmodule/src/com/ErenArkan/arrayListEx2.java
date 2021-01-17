package com.ErenArkan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class arrayListEx2 {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {

            displayMenu();
            int input = new Scanner(System.in).nextInt();

             if (input == 1) {
                int addInput = new Scanner(System.in).nextInt();
                addValue(array, addInput);
            } else if (input == 2) {
                int removeInput = new Scanner(System.in).nextInt();
                removeValue(array, removeInput);
            } else if (input == 3) {
                 System.out.println("");
                 System.out.println(array);
                 System.out.println("");
            } else if (input == 4) {
                break;
            }
        }
        addTest();
        removeTest();
    }

    private static void displayMenu () {
        System.out.println("");
        System.out.println("1. add a value");
        System.out.println("2. remove a value");
        System.out.println("3. display values");
        System.out.println("4. exit");
        System.out.println("");
        System.out.println("Your input: ");

    }

    private static void addValue(ArrayList<Integer> input, int value) {
        input.add(value);
    }

    private static void removeValue(ArrayList<Integer> input, int value) {

        if (!input.contains(value)) return;
        input.remove(input.indexOf(value));
    }

    public static void addTest() {

        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);

        addValue(testArray, 4);

        assertEquals(testArray.get(5), 4);

    }

    public static void removeTest() {

       ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);

        removeValue(testArray, 5);

        assertEquals(testArray.get(3), 4);
    }



}