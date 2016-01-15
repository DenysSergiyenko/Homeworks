package com.DSergiyenko.homeworks.homework3.task2;

import java.util.Scanner;

public class Homework3_task2_runner {
    public static void main(String[] args) {
        RozeBush rozeBush = new RozeBush();
        Flower r = new Roze();
        Flower c = new Camomile();
        Flower a = new Aster();
        String tempS;

        System.out.println("How many flowers would you like to put into the bouquet?");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        Bouquet bouquet1 = new Bouquet();

        try {
            bouquet1.numberOfFlowers = Integer.parseInt(s);
            if (bouquet1.numberOfFlowers <= 0) {
                //System.out.println("number should be > 0");
                throw new InvalidNumberOfFlowersException(bouquet1.numberOfFlowers);

            }
            System.out.println("you've requested: " + bouquet1.numberOfFlowers + " flowers");
        }
        catch (NumberFormatException | InvalidNumberOfFlowersException xx){
            System.out.println("you've entered: '" + s + "'");
            System.out.println("This is an invalid number!  Number of flowers should be input (1) in numberic symbols, (2) it should be an integer and (3) be above zero");
            //System.out.println("would you like to try again?");
            //System.out.println(xx.getMessage());
            //System.out.println(xx.getClass());
        }

        finally {
            System.out.println("Thanks and good bye");

        }








        //Bouquet threeRozes = new Bouquet();

        //System.out.println(threeRozes.flowers[3]);

    }
}
