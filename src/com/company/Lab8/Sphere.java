package com.company.Lab8;

public class Sphere implements GeometricBody{
    private double r;

    public Sphere(){}

    public Sphere(double r){
        this.r = r;
    }

    public double getSurface() {
        return 4*r*r*Math.PI;
    }

    public double getVolume(){
        return (4*r*r*r*Math.PI)/3;
    }

}
