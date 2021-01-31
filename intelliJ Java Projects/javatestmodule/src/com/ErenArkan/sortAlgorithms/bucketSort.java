package com.ErenArkan.sortAlgorithms;

import com.ErenArkan.Stacks.ArrayListStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class bucketSort {

    public static void main(String[] args) {
        int[] array = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bucketSort(int[] inputArray) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
//            using ArrayList:
//            buckets[i] = new ArrayList<>();

//            using LinkedList:
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < inputArray.length; i++) {
            buckets[hash(inputArray[i])].add(inputArray[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int inputIndex = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                inputArray[inputIndex++] = buckets[i].get(j);
            }
        }
    }

    public static int hash(int value) {
        return value / 10;
    }
}
