package com.ErenArkan;

public class twoDimArraysEx1 {

    public static void main(String[] args) {


        int[][] newArray = getNewArray();

        sumRows(newArray);

        System.out.println("");

        sumColumns(newArray);


    }

    private static void sumColumns(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int n = 0; n < input[i].length; n++) {
                sum += input[n][i];
            }
            System.out.println("Sum of column " + i + " is " + sum);
        }
    }


    public static void sumRows(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int n = 0; n < input[i].length; n++) {
                sum += input[i][n];
            }
            System.out.println("Sum of row " + i + " is " + sum);
        }
    }

        public static int[][] getNewArray () {
            return new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        }


}
