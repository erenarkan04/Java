package com.ErenArkan.searchAlgos;

public class binarySearchMain {

    public static void main(String[] args) {

        int[] array = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(array, 20));
        System.out.println(recursiveBinarySearch(array, 20, 0, array.length));

    }


    public static int iterativeBinarySearch(int[] input, int searchValue) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midPoint = (end + start) / 2;
            if (input[midPoint] == searchValue) return midPoint;
            else if (input[midPoint] < searchValue) {
                start = midPoint + 1;
            }
            else if (input[midPoint] > searchValue) {
                end = midPoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int searchValue, int start, int end) {
        if (start >= end) return -1;
        int midPoint = (start + end) / 2;;

        if (input[midPoint] == searchValue) return  midPoint;

        else if (input[midPoint] < searchValue) return recursiveBinarySearch(input, searchValue, midPoint + 1, end);
        else return recursiveBinarySearch(input, searchValue, start, midPoint);
    }
}
