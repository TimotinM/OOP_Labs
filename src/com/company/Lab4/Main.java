package com.company.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Expression expression;
        try {
            File exp = new File("src/com/company/Lab4/three_expressions.txt");
            Scanner reader = new Scanner(exp);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                expression = new Expression(data);
                if (expression.checkExpression())
                    System.out.println(data + "  is CORECT");
                else
                    System.out.println(data + "  is INCORECT");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
