/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 4: Write a Java program that inputs the radius and height of a cylinder and calculates and prints
the volume and total surface area.

*Formula List* 'Let r = radius and h = height'

Volume = Pi * r^2 * h
In java = Math.PI * Math.pow(r,2) * h

Total Surface Area = Pi * r^2 + 2 * Pi * r * h
In java =  Math.PI * Math.pow(r,2) + 2 * Math.PI * r * h
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex4{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double radius, height, volume, totalSurfaceArea = 0.0;

        System.out.print("Enter radius of cylinder = ");
        radius = input.nextDouble();
        System.out.print("Enter height of cylinder = ");
        height = input.nextDouble();

        input.close();

        volume = Math.PI * Math.pow(radius,2) * height;

        totalSurfaceArea = (Math.PI * Math.pow(radius,2)) + (2 * Math.PI * radius * height);

        System.out.println("Volume of cylinder = " + volume + " cm^3");
        System.out.println("Total Surface Area of cylinder = " + totalSurfaceArea + " cm^2");
        
    }
}