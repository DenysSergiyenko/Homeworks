package com.DSergiyenko.Homework4;

/**
 * Created by DsergiyenkoN on 22.12.2015.
 */
public class TemperatureConvert {
    public static double farenheitToCelcius (double f){
        return (f-32)/1.8;
    }
    public static double celciusToFarenheit (double c){
        return (c*1.8+32);
    }
}
