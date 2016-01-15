package com.DSergiyenko.homeworks.homework3.task3;

import sun.applet.Main;

import java.util.Scanner;

/**
 * Created by DsergiyenkoN on 11.01.2016.
 */
public class MusicalShop {
    final String shopAddress = "Vasylkivska 90";
    String shopName;
    public Instrument[] instruments;
    int currentInstrumentStock=0;
    private static Instrument defaultInstrument = new Piano();


    public Instrument[] listAvailableInstruments (String shopName){
        return this.instruments;
    }

    public MusicalShop (){
        currentInstrumentStock=0;
        this.shopName="Musical Shop";
        //instruments = new Instrument[1];
    }

    public MusicalShop (String name){
        //currentInstrumentStock=0;
        shopName=name;
        //instruments = new Instrument[1];
    }

    public void addInstrument(MusicalShop currentMusicalShop) throws IllegalInstrumentExpection {
        System.out.println("please enter new instrument to the shop " + shopName);
        System.out.println("only possible instruments at this stage are Piano, Trumpet, Guitar");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        //System.out.println(s.equals(Piano.defaultPianoName));


        if ((s.equals(Guitar.defaultGuitarName))||(s.equals(Trumpet.defaultTrumpetName))||(s.equals(Piano.defaultPianoName))) {

            currentMusicalShop.currentInstrumentStock++;
            System.out.print(s + " added to music shop '" + currentMusicalShop.shopName + "'");
            System.out.println(" inder stock # " + currentMusicalShop.currentInstrumentStock);

        } else {
            //System.out.println(s);
            System.out.println(s + "<>" + Guitar.defaultGuitarName +","+  Trumpet.defaultTrumpetName +","+ Guitar.defaultGuitarName );
            System.out.println("new instrument addition failed");
        }



    }
}
