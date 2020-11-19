package com.company.Lab7;

public class Square extends Figure{
    private float a;

    public Square() {}

    public Square(float a) {
        this.a = a;
    }
   @Override
    float getArea() { return this.a*this.a;}

   @Override
    float getPerimeter() { return 4*this.a;}
}
