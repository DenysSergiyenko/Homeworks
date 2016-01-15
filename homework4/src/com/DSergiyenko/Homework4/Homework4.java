package com.DSergiyenko.Homework4;

import jdk.nashorn.internal.parser.Scanner;

/**
 * Created by DsergiyenkoN on 21.12.2015.
 */
public class Homework4 {

    public static void main (String[] args) {

        //task#1:
        double r = 2;
        System.out.println("task1:");
        System.out.print("circle area with r=" + r + "=");
        System.out.println(AreaCalc.circleAreaCalc(r));

        double side1=3;
        double side2=4;
        double side3=5;
        System.out.print("tirange area with sides " + side1 + ", " + side2 + ", " +side3 + "=");
        System.out.println(AreaCalc.triangleAreaCalc(3,4,5));

        double width=2;
        double height=3;
        System.out.print("rectangle area with sides " + width + " and height " + height + " =");
        System.out.println(AreaCalc.rectangleAreaCalc(width,height));
        System.out.println();

        //task#2:
        double c=36.6;
        double f=75;
        System.out.println("task2:");


        System.out.print( c + " Celcium is " + TemperatureConvert.celciusToFarenheit(c) + " Farenheit");
        System.out.println();
        System.out.print( f + " Farenheit is " + TemperatureConvert.farenheitToCelcius(f) + " Celcium");
        System.out.println();

        //task#3:
        double x1=0;
        double y1=0;
        double x2=4;
        double y2=3;

        System.out.println("task3");
        System.out.print("distance between  (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") = ");
        System.out.println(Measure.distance(x1,y1,x2,y2));
    }
}
