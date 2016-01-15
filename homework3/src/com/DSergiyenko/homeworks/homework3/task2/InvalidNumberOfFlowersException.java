package com.DSergiyenko.homeworks.homework3.task2;

/**
 * Created by DsergiyenkoN on 12.01.2016.
 */
public class InvalidNumberOfFlowersException extends Exception {
    private int numberOfFlowers;

    public int getNumberOfFlowers(){
        return this.numberOfFlowers;
    }

    public InvalidNumberOfFlowersException(int numberOfFlowers){
        this.numberOfFlowers=numberOfFlowers;
    }
}
