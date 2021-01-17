package com.ErenArkan.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class arrayLists {

    public static void main (String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add(1, "strawberry");

        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));


        fruits.set(1, "mango");

        System.out.println(fruits);


        fruits.remove(1);

        System.out.println(fruits);

        fruits.remove("banana");

        System.out.println(fruits);

        System.out.println(fruits.size());

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i) + ", ");
        }

        Collections.sort(fruits);

        System.out.println(fruits);








    }
}
