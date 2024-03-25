/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 2: Write a program that accepts a number and checks whether the number is a prime number.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex2{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double number, cNum = 0.0;

        System.out.print("Enter number = ");
        number = input.nextDouble();

        input.close();

        cNum = Math.sqrt(number);

        if (number == Math.pow(cNum,2))
        System.out.println(number + " is a prime number");
        else
        System.out.println(number + " is not a prime number");
        
    }
}









