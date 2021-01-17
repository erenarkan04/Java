package com.ErenArkan.ArrayList;

import java.util.Arrays;

public class twoDimArrays {

    public static void main (String[] args) {

        int [][] numbers = {{0, 1, 3}, {4, 5, 6}};

//        printArrays(numbers);

        int[][] newArray = getArray();

        int[][] raggedArray = getRaggedArray();

        printArray(newArray);

        System.out.println(" ");
        printArray(raggedArray);



    }

    public static int[][] getArray() {
        return new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
    }

    public static int[][] getRaggedArray() {
        return new int[][] {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}};
    }

    public static void printArray (int[][] input) {
        for (int i = 0; i < input.length; i++){
            for (int n = 0; n < input[i].length; n++) {
                System.out.print(input[i][n] + " " );
            }

            System.out.println(" ");
//            input[i] is a separate array of row i
        }



    }


    public static void printArrays (int[][] numbers) {

        for (int i = 0; i < 2; i++){
            for (int n = 0; n < 3; n++) {
                System.out.print(numbers[i][n] + " " );
            }
        }

        System.out.println("");

        for (int i = 0; i < 3; i++){
            for (int n = 0; n < 2; n++) {
                System.out.print(numbers[n][i] + " " );
            }
        }
        System.out.println("");

        System.out.println(Arrays.toString(numbers[0]) + Arrays.toString(numbers[1]));

        System.out.println("");

        System.out.println(Arrays.deepToString(numbers));
    }


}
