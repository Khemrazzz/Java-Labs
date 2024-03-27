/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 4: Write a program that accepts a character and the prints whether the character is a vowel or a
consonant otherwise it prints wrong input.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex4{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        String data;
        char character;

        System.out.print(" Enter your desired character = ");
        data = input.nextLine();
        if (data.length() == 1){
        character = data.charAt(0);
        if (Character.isLetter(character)){
        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
        System.out.println(character + " is a vowel");
        else 
        System.out.println(character + " is a consonant");
        }else{
        System.out.println("*Wrong Input*");
        }
        }else{
        System.out.println("*Wrong Input*");
        }
        
        input.close();

    }
}

