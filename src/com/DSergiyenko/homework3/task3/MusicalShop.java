package com.DSergiyenko.homework3.task3;

/**
 * Created by DsergiyenkoN on 11.01.2016.
 */
public class MusicalShop {
    final String shopAddress = "Vasylkivska 90";
    String shopName;
    public Instrument[] instruments;
    int currentInstrumentStock=0;

    public Instrument[] listAvailableInstruments (String shopName){
        return this.instruments;
    }

    public MusicalShop (){
        currentInstrumentStock=0;
        this.shopName="Musical Shop";
        //instruments = new Instrument[1];
    }

    public MusicalShop (String name){
        currentInstrumentStock=0;
        shopName=name;
        //instruments = new Instrument[1];

    }
}
