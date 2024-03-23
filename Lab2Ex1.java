/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 1: Write a Java program that inputs the base and height of a right angle triangle and calculates
and prints the hypotenuse, perimeter and area.

*Formula List* 'Let A = base and B = height'

Hypotenuse = C = 'Square-Root'(A^2 + B^2)
In java = Math.sqrt(A * A + B * B)

Perimeter = A + B + C 

Area = 0.5 * A * B 
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double base, height, hypotenuse, perimeter, area = 0.0;

        System.out.print("Enter base of right angle = ");
        base = input.nextDouble();

        System.out.print("Enter height of right angle = ");
        height = input.nextDouble();

        input.close();

        hypotenuse = Math.sqrt((base * base) + (height * height));

        perimeter = base + height + hypotenuse;

        area = 0.5 * base * height;

        System.out.println("Hypotenuse of right angle triangle = " + hypotenuse + " cm");
        System.out.println("Perimeter of right angle triangle = " + perimeter + " cm");
        System.out.println("Area of right angle triangle = " + area + " cm^2");

    }
}