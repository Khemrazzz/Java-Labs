/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 1: Write a program that accepts a number and checks whether the number is even or odd.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Enter number = ");
        number = input.nextInt();

        input.close();

        if (number % 2 == 0)
        System.out.println(number + " is an even number");
        else
        System.out.println(number + " is an odd number");

    }
}
