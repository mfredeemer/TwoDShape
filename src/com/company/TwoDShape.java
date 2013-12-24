package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 24/12/13
 * Time: 23:27
 */
public class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name = "null";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape object) {
        width = object.width;
        height = object.height;
        name = object.name;
    }

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }
    void  setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and Height are " + width + " and " + height);

    }

    double area() {
        System.out.println("area() muts me overriden");
        return 0.0;
    }

}
