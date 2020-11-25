package com.company.Lab8;

public class Cube implements GeometricBody{
  private double a;

  public Cube(){}

  public Cube(double a){
      this.a = a;
  }

  public double getSurface(){
    return 6*a*a;
  }

  public double getVolume(){
    return a*a*a;
  }
}
