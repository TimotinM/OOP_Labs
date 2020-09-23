package com.company.Lab1_Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        university UTM = new university();
        UTM.name = "UTM";
        UTM.foundationYear = 1964;

        student John = new student();
        John.name = "John";
        John.age = 19;
        John.mark = 6.66;

        UTM.students.add(John);

        student Mark = new student();
        Mark.name = "Mark";
        Mark.age = 20;
        Mark.mark = 7.89;

        UTM.students.add(Mark);

        student Anna = new student();
        Anna.name = "Anna";
        Anna.age = 20;
        Anna.mark = 8.69;

        UTM.students.add(Anna);

        university USM = new university();
        USM.name = "USM";
        USM.foundationYear = 1946;

        student Ion = new student();
        Ion.name = "Ion";
        Ion.age = 21;
        Ion.mark = 6.9;

        USM.students.add(Ion);

        student Maria = new student();
        Maria.name = "Maria";
        Maria.age = 20;
        Maria.mark = 7.25;

        USM.students.add(Maria);

        university ASEM = new university();
        ASEM.name = "ASEM";
        ASEM.foundationYear = 1991;

        student Miron = new student();
        Miron.name = "Miron";
        Miron.age = 24;
        Miron.mark = 5.55;

        ASEM.students.add(Miron);

        student Lara = new student();
        Lara.name = "Lara";
        Lara.age = 19;
        Lara.mark = 9.02;

        ASEM.students.add(Lara);

        media UAM = new media();

        System.out.println(UTM.name + "average media = " + UAM.UMedia(UTM) + "\n" +
                           USM.name + "average media = " + UAM.UMedia(USM) + "\n" +
                           ASEM.name + "average media = " + UAM.UMedia(ASEM));
    }
}

class student{
    String name;
    int age;
    double mark;
}

class university{
    String name;
    int foundationYear;
    List<student> students = new ArrayList<>();
}

class media{
    public static double UMedia(university marks){
        double UniversityAverage = 0;
        for (student i : marks.students){
            UniversityAverage = UniversityAverage + i.mark;
        }

        return UniversityAverage / marks.students.size();
    }
}
