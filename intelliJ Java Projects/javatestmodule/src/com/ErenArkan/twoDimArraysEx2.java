package com.ErenArkan;

public class twoDimArraysEx2 {
    public static void main(String[] args) {


        int[][] newArray = getNewArray();

        getMaxRows(newArray);

        System.out.println("");


    }
//
//    private static void getMaxColumns(int[][] input) {
//        for (int i = 0; i < input.length; i++) {
//            int max = input[0][i];
//            for (int n = 0; n < input[i].length; n++) {
//                if (input[n][i] > 0) {
//                    max = input[n][i];
//                }
//                System.out.println("Max of column " + i + " is " + max);
//            }
//        }
//    }

    public static void getMaxColumns(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            int max = input[i][0];
            for (int n = 0; n < input[i].length; n++) {
                if (input[i][n] > max) {
                    max = input[i][n];
                }
            }
            System.out.println("Max of row " + (i + 1 ) + " is " + max);
        }
    }
    public static void getMaxRows(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            int max = input[i][0];
            for (int n = 0; n < input[i].length; n++) {
                if (input[i][n] > max) {
                    max = input[i][n];
                }
            }
            System.out.println("Max of row " + (i + 1 ) + " is " + max);
        }
    }

    public static int[][] getNewArray() {
        return new int[][]{
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 11, 4}};
    }

}



