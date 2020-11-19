package com.company.Lab7;

public class Rectangle extends  Figure{
    private float a;
    private float b;

    public Rectangle() {}

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    @Override
    float getArea() {
        return this.a*this.b;
    }

    @Override
    float getPerimeter() {
        return 2 * (this.a + this.b);
    }

}
