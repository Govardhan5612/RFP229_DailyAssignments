package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProblemStatement {
    public static void anagramOne(String word1,String word2){
        char [] array1 = word1.toCharArray();
        char [] array2 = word2.toCharArray();

        if (array1.length==array2.length){
           Arrays.sort(array1);//using static sort method in Array class
           Arrays.sort(array2);

           if (Arrays.equals(array1,array2)){//using static equals method in Array class
               System.out.println(word1+" and "+word2+" are Anagram words");
           }

           else {
               System.out.println(word1 + " and " + word2 + " are not Anagram words");
           }
        }
        else {
            System.out.println(word1+" and "+word2+" are not Anagram words");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Use Scanner take input from objects
        System.out.print("Enter the first word : ");
        String firstWord = input.next();
        System.out.print("Enter the second word : ");
        String secondWord = input.next();

        String word1= firstWord.toLowerCase();
        String word2= secondWord.toLowerCase();
        anagramOne(word1,word2);//static method calling




    }
}
