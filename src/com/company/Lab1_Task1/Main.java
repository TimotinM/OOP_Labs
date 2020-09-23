package com.company.Lab1_Task1;

public class Main{
    public static void main(String[] args){

        monitor mon1 = new monitor();
        mon1.color = "Black";
        mon1.DimensionHeight = 15.7;
        mon1.DimensionWidth = 25.3;
        mon1.ResolutionHeight = 1080;
        mon1.ResolutionWidth = 1920;

        monitor mon2 = new monitor();
        mon2.color = "Gray";
        mon2.DimensionHeight = 32.8;
        mon2.DimensionWidth = 57;
        mon2.ResolutionHeight = 2160;
        mon2.ResolutionWidth = 3840;
        CompareMonitors cm = new CompareMonitors();
        cm.Compare(mon1, mon2);

    }
}

class monitor{
    String color;
    int ResolutionHeight, ResolutionWidth; //pixels
    double DimensionHeight, DimensionWidth;   //inches
}

class CompareMonitors{
    public static void Compare(monitor m1, monitor m2 ){
        System.out.println("RESOLUTION \n" + m1.color + " monitor " + m1.ResolutionWidth + "x" + m1.ResolutionHeight
        + " vs " + m2.ResolutionWidth + "x" + m2.ResolutionHeight + " " + m2.color + " monitor");
    }
}
