package com.ErenArkan.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class forEachLoop {

    public static void main (String[] args) {

   ArrayList<String> itemsList = new ArrayList<>();

      itemsList.add("item1");
      itemsList.add("item2");
      itemsList.add("item3");

      for (String item : itemsList) {
           System.out.println(item); }

        int[] array = {5, 2, 2, 0};

        int n = 0;
      for (int value : array) {

            System.out.println(value + " " + n++);
        }

      for(int i = 0; i < array.length; i++) {
        System.out.println(array[i] + " " + i);
       }
    }
}
