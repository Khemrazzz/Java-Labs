/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 6: Write a Java program that inputs the radius of a sphere and calculates and prints the volume
and total surface area.

*Formula List* 'Let r = radius'

Volume = 4/3 * Pi * r^3
In java = (4/3) * Math.PI * Math.pow(r,3)

Total Surface Area = 4 * Pi * r^2
In java = 4 * Math.PI * Math.pow(r,2)
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex6{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double radius, volume, totalSurfaceArea = 0.0;

        System.out.print("Enter radius of sphere = ");
        radius = input.nextDouble();

        input.close();

        volume = (4/3) * Math.PI * Math.pow(radius,3);

        totalSurfaceArea = 4 * Math.PI * Math.PI * Math.pow(radius,2);

        System.out.println("Volume of sphere = " + volume + " cm^3");
        System.out.println("Total Surface Area of sphere = " + totalSurfaceArea + " cm^2");

    }
}