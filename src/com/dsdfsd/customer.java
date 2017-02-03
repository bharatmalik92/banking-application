package com.dsdfsd;


import java.util.ArrayList;

/**
 * Created by bharatmalik on 2017-01-24.
 */
public class customer {
    private  String name;
   private  ArrayList<Double> transcations;

    public customer(String name,double intialamount) {
        this.name = name;
        this.transcations=new ArrayList<Double>();

    }

    public void addtransaction( double intialamount){

        transcations.add(intialamount);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTranscations() {
        return transcations;
    }
}

