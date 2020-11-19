package com.company.Lab7;

import java.util.ArrayList;

public class FigureController {
    private final ArrayList<Figure> tmp = new ArrayList<>();

    public void Analyse(ArrayList<Figure> list){
        tmp.addAll(list);
    }

    public float getBestArea(){
        float value=0;
        for (Figure figure : tmp) {
            if (figure.getArea() > value) {
                value = figure.getArea();
            }
        }
        return value;
    }

    public double getBestPerimeter(){
        float value=0;
        for (Figure figure : tmp) {
            if (figure.getPerimeter() > value) {
                value = figure.getPerimeter();
            }
        }
        return value;
    }
}
