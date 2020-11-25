package com.company.Lab8;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(9);
        Parallelepiped parallelepiped = new Parallelepiped(11, 7, 9);
        Sphere sphere = new Sphere(4);

        ArrayList<GeometricBody> geometricBodyArrayList = new ArrayList<>();
        geometricBodyArrayList.add(cube);
        geometricBodyArrayList.add(parallelepiped);
        geometricBodyArrayList.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        geometricBodyController.getList(geometricBodyArrayList);

        System.out.println("Best Surface " + geometricBodyController.getBestSurface());
        System.out.println("Best Volume " + geometricBodyController.getBestVolume());
    }
}
