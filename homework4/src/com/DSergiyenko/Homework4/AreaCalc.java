package com.DSergiyenko.Homework4;

/**
 * Created by DsergiyenkoN on 22.12.2015.
 */
public class AreaCalc {
    static double circleAreaCalc (double r ) {
        return 3.141592654*r*r;
    }
    static double triangleAreaCalc (double side1, double side2, double side3) {
        double p=side1+side2+side3;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));

    }
    static double rectangleAreaCalc (double w, double h) {
        return w*h;
    }
}
