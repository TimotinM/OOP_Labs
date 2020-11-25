package com.company.Lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    private ArrayList<GeometricBody> tmp = new ArrayList<>();

    public void getList(ArrayList<GeometricBody> list){
        tmp.addAll(list);
    }

    public double getBestSurface(){
        double value=0;
        for(GeometricBody answer : tmp){
            if(answer.getSurface()>value){
                value=answer.getSurface();
            }
        }
        return value;
    }

    public double getBestVolume(){
        double value=0;
        for(GeometricBody answer : tmp){
            if(answer.getVolume()>value){
                value=answer.getVolume();
            }
        }
        return value;
    }
}
