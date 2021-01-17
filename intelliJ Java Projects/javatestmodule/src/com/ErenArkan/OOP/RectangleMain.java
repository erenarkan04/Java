package com.ErenArkan.OOP;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle[] rectArray = new Rectangle[3];

        getInput(rectArray);

        printArray(rectArray);
    }

    static void getInput(Rectangle[] rectArray) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Input width & height for r" + (i + 1) + " :");
            rectArray[i] = new Rectangle(input.nextDouble(), input.nextDouble());
        }
    }

    static void printArray (Rectangle[] rectArray){
        for (int i = 0; i < 3; i++) {
            System.out.println("Rectangle" + (i + 1) + ": width: " + rectArray[i].getWidth() + " height: " + rectArray[i].getHeight());
        }
    }
}

