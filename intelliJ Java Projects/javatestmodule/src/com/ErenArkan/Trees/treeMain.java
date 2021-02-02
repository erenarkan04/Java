package com.ErenArkan.Trees;

import java.util.Locale;

public class treeMain {
    public static void main(String[] args) {

        tree newTree = new tree();
        newTree.insert(25);
        newTree.insert(20);
        newTree.insert(15);
        newTree.insert(27);
        newTree.insert(30);
        newTree.insert(29);
        newTree.insert(26);
        newTree.insert(22);
        newTree.insert(32);

//        newTree.traverseInOrder();
//
//        System.out.println();
//        System.out.println(newTree.get(27).getData());
//        System.out.println(newTree.get(15).getData());
//        System.out.println(newTree.get(888));

//        newTree.delete(22);
        newTree.traverseInOrder();
        System.out.println();
        newTree.traverseInPreOrder();

//        System.out.println(isEven(3));
        System.out.println(countB("BBBBBbbBBb"));
    }

//    public static boolean isEven (int input) {
//
//        if input <= 0 return;
//
//        isEven(input / 2);
//
//    }

    public static int countB(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') count++;
        }
        return count;
    }

}
