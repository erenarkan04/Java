package com.ErenArkan;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListsEx1 {
    public static void main (String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(4);
        numbers.add(4);

        System.out.println(numbers);

        ArrayList<Integer> newArray = new ArrayList<>();

        for (Integer values : numbers) {
            if (!newArray.contains(values)) {
                newArray.add(values);
            }
        }

        Collections.sort(newArray);
        System.out.println(newArray);


    }

}
