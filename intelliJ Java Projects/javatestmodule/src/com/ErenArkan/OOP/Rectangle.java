package com.ErenArkan.OOP;

public class Rectangle {

    private double width;
    private double height;

    Rectangle() {
       this(1, 1);
    };

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getArea() {
       return this.height * this.width;
    }

    double getPerimter() {
        return (this.width * 2) + (this.height * 2);
    }

}
