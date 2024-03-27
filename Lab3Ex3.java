/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 3: Write a program that accepts two numbers and checks which of the two numbers is greater than
the other.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex3{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double num1, num2 = 0.0;

        System.out.print("Enter Number 1 = ");
        num1 = input.nextDouble();
        System.out.print("Enter Number 2 = ");
        num2 = input.nextDouble();
    
        input.close();

        if (num1 > num2)
        System.out.println(num1 + " is greater than " + num2);
        else if (num2 > num1)
        System.out.println(num2 + " is greater than " + num1);
        else
        System.out.println(num1 + " is equal to " + num2);
    }
}