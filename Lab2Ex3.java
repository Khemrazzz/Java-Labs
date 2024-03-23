/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 3: Write a Java program that inputs the radius of a circle and calculates and prints the
circumference and area.

*Formula List* 'Let r = radius'

Circumference = 2 * Pi * r
In java = 2 * Math.PI * r

Area = Pi * r^2
In java = Math.PI * Math.pow(r,2)
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex3{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double radius, circumference, area = 0.0;

        System.out.print("Enter radius of the circle = ");
        radius = input.nextDouble();

        input.close();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius,2);

        System.out.println("Circumference of circle = " + circumference + " cm");
        System.out.println("Area of circle = " + area + " cm^2");

    }
}
