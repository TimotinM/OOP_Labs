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

        Figure circle = new Figure() {
            private double radius;

            Figure init(double radius){
                this.radius = radius;
                return this;
            }
            @Override
            float getArea() {
                return (float) (Math.PI * radius * radius);
            }

            @Override
            float getPerimeter() {
                return (float) (2 * Math.PI * radius);
            }
        }.init(4);
        System.out.println("Circle Area "+circle.getArea());
        System.out.println("Circle Perimeter "+circle.getPerimeter());

        figures.add(circle);
        figureController.Analyse(figures);
        System.out.println("Best Area "+figureController.getBestArea());
        System.out.println("Best Perimeter "+figureController.getBestPerimeter());
    }
}

