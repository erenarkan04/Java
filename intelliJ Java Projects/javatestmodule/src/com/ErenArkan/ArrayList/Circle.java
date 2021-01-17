//package com.ErenArkan;
//
//import java.awt.*;
//
//public class Circle {
//
//    private Point center;
//    private double radius;
//    private static int numberOfCircles;
//
//    Circle() {
//        numberOfCircles++;
//    }
//
//    Circle (Point center, double radius) {
//        numberOfCircles++;
//        this.center = center;
//        this.radius = radius;
//    }
//
//    public double getRadius () {
//        return radius;
//    }
//
//    public static int getNumberOfCircles () {
//        return numberOfCircles;
//    }
//
//    double getPerimeter () {
//        return 2 * Math.PI * this.radius;
//    }
//
//    double getArea () {
//        return Math.PI * this.radius * this.radius;
//    }
//
//    double getPerimeter () {
//        return Math.PI * 2 * this.radius;
//    }
//
//    public void setCenter (Point center) {
//        this.center = center;
//    }
//
//    public void setRadius (double radius) {
//        if(radius < 0)this.radius = 0;
//        else this.radius = radius;
//    }
//
//}
