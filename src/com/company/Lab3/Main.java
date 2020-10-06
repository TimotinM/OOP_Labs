package com.company.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            String data = "";
            File myObj = new File("src/com/company/Lab3/Text.txt");
            Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 data += myReader.nextLine();
             }
             Text text = new Text(data);

        System.out.println(" Number of sentences: " + text.sentences +
                            "\n Number of words: " + text.nrWords +
                            "\n Number of letters: " + text.letters +
                            "\n Number of Volwels: " + text.vowels +
                            "\n Number of Consonants: " + text.consonants +
                            "\n Longest word: " + text.longestWord +
                            "\n Top 5 words: " + text.top5);

    }


}
