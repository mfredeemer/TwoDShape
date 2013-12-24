package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 24/12/13
 * Time: 23:48
 */
public class Rectangle extends TwoDShape {
    Rectangle(){
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle object){
        super(object);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getHeight() * getWidth();
    }
}
