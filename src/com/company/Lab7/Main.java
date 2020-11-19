package com.company.Lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(6,4);
        Triangle triangle = new Triangle(2,3,4);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        FigureController figureController = new FigureController();
        figureController.Analyse(figures);

        System.out.println("Best Area "+figureController.getBestArea());
        System.out.println("Best Perimeter "+figureController.getBestPerimeter());

        Circle circle = new Circle(7);
        System.out.println("Circle Area "+circle.getArea());
        System.out.println("Circle Perimeter "+circle.getPerimeter());

        figures.add(circle);
        figureController.Analyse(figures);
        System.out.println("Best Area "+figureController.getBestArea());
        System.out.println("Best Perimeter "+figureController.getBestPerimeter());
    }
}

class Circle extends Figure{
    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    float getArea() {
        return (float) (Math.PI*radius);
    }

    @Override
    float getPerimeter() {
        return (float) (2*Math.PI*radius);
    }
}

