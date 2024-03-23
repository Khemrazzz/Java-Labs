/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 2: Write a Java program that inputs the length and width of a rectangle and calculates and prints
the perimeter and area.

*Formula List* 'Let A = length and B = width'

Perimeter = 2 * (A + B)

Area = A * B 
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex2{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double length, width, perimeter, area = 0.0;

        System.out.print("Enter length of rectangle = ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle = ");
        width = input.nextDouble();

        input.close();

        perimeter = 2 * (length + width);

        area = length * width;

        System.out.println("Perimeter of rectangle = " + perimeter + " cm");
        System.out.println("Area of rectangle = " + area + " cm^2");
        
    }
}