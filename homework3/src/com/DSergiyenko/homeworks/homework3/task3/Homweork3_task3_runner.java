package com.DSergiyenko.homeworks.homework3.task3;


/**
 * Created by DsergiyenkoN on 11.01.2016.
 */
public class Homweork3_task3_runner {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        Trumpet t = new Trumpet();
        MusicalShop MS = new MusicalShop("Bla-bla shop");
        MS.shopName="Yamaha musical shop";

        System.out.println(MS.shopName);
        System.out.println(MS.shopAddress);
        System.out.println("currently " + MS.currentInstrumentStock + " instruments in stock");

//        p.play();
//        g.play();
//        t.play();

        try {
            MS.addInstrument(MS);
        } catch (IllegalInstrumentExpection illegalInstrumentExpection) {
            illegalInstrumentExpection.printStackTrace();
        } catch (Exception ex) {
            System.out.println("shittt! smth else went wrong");
        }


        //Instrument.play(1,2);
        //Instrument.orchestraPlay(1,2);

    }
}
