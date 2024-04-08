/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 7: Write a program that accepts a number from 1 to 10 and prints the corresponding word equivalent.
E.g, 1 – One, 2 – Two, …, 10 – Ten.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex7{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter number between 1 to 10 inclusive!\n:");
        num = input.nextInt();

        input.close();

        switch(num){
            case 1 : System.out.println("ONE");
            break;
            case 2 : System.out.println("TWO");
            break;
            case 3 : System.out.println("THREE");
            break;
            case 4 : System.out.println("FOUR");
            break;
            case 5 : System.out.println("FIVE");
            break;
            case 6 : System.out.println("SIX");
            break;
            case 7 : System.out.println("SEVEN");
            break;
            case 8 : System.out.println("EIGHT");
            break;
            case 9 : System.out.println("NINE");
            break;
            case 10 : System.out.println("TEN");
            break;
            default : System.out.println("Wrong Input");
        }
    }
}





