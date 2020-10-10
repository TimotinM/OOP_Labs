package com.company.Lab3;


import java.util.ArrayList;
import java.util.Arrays;

public class Text {
    int letters;
    int sentences;
    int vowels;
    int consonants;
    int nrWords;
    String longestWord;
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> top5 = new ArrayList<>();

    Text (String word)
    {
        sentences = sentencesCount(word);
        word = cut(word);
        vowels = vowelsCount(word);
        letters = nrleterst(word);
        consonants = letters - vowels;
        countWords(word);
        nrWords = words.size();
        longestWord = words.get(lWord());
        top();
    }

    public  int vowelsCount(String str){
        int cvowels = 0;
        for(char c: str.toCharArray())
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                cvowels++;
        return  cvowels;
    }

    public int  nrleterst(String str){
        int ccount = 0;
        for(char c: str.toCharArray())
            if((c >= 'a'&& c <= 'z'))
                ccount++;
        return  ccount;
    }

    public int sentencesCount(String str){
        int scount = 0;
        for (char c: str.toCharArray())
        {
            if (c == '.' || c == '?' || c == '!')
                scount++;
        }
        return scount;
    }

    public void countWords(String str){
        int iold = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') {
                words.add(str.substring(iold, i));
                iold = i + 1;
            }
        }
        words.add(str.substring(iold, str.length() - 1));
    }

    public int lWord(){
        int index = 0;
        int max = 0;
        for(int i = 0; i < words.size(); i++)
        {
            if (words.get(i).length() > max)
            {
                max = words.get(i).length();
                index = i;
            }
        }
        return index;
    }

    public void top(){
        int [][] arr = new int [words.size()][2];
        for(int i = 0; i < words.size(); i++){
            arr[i][0] = 1;
            arr[i][1] = i;
            for(int j = i + 1; j < words.size(); j++){
                if ((words.get(i)).equals(words.get(j))){
                    arr[i][0]++;
                    words.remove(j);
                }
            }
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < 5; i++ ){
            top5.add(words.get(arr[i][1]));
        }

    }


    public String cut(String word){
        word = word.toLowerCase();
        word = word.replace(".", "");
        word = word.replace(",", "");
        word = word.replace("!", "");
        word = word.replace("?", "");
        word = word.replace(":", "");
        word = word.replace(";", "");
        word = word.replace("[", "");
        word = word.replace("]", "");
        word = word.replace("(", "");
        word = word.replace(")", "");
        return word;
    }
}
