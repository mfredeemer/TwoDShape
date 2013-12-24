package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 24/12/13
 * Time: 23:38
 */
public class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        style = "null";
    }

    Triangle(String s,double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");
        style = "isosceles";
    }

    Triangle(Triangle object) {
        super(object);
        style = object.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }


}
