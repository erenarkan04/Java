package com.ErenArkan.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class kaanEx1 {

    public static void main (String[] args) {
        int[] array = {-2, 3, 10, -2, -2, 0};

        System.out.println("Enter value and index: ");

        Scanner a = new Scanner(System.in);

        boolean invalidInput = true;

        while (true) {
            try {
                int valueInput = a.nextInt();
                int indexInput = a.nextInt();
                System.out.println(Arrays.toString(addElement(array, valueInput, indexInput)));
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid int value");
                a.next();
            }
        }

    }

    public static int[]  addElement (int[] input, int value, int index) {

        if (value < 0 || index < 0) {
            return new int[0];
        }

        int[] outputArray = new int[input.length + 1];

        for (int i = 0; i < outputArray.length; i++) {
            if (i >= index) {
                outputArray[i] = input[i - 1];
            }
            else {
                outputArray[i] = input[i];
            }
        }
        outputArray[index] = value;

        return outputArray;
    }
    
}
