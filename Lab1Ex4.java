/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 4: Write a Java program to declare the radius and height of a cylinder of type double. Assign
values to the variables. The program must calculates and prints the volume and total surface
area.

*Formula List* 'Let r = radius and h = height'

Volume = Pi * r^2 * h
In java = Math.PI * Math.pow(r,2) * h

Total Surface Area = Pi * r^2 + 2 * Pi * r * h
In java =  Math.PI * Math.pow(r,2) + 2 * Math.PI * r * h
*/

import java.io.*;

public class Lab1Ex4{
    public static void main(String args[]){

        double radius, height, volume, totalSurfaceArea = 0.0;

        radius = 7.45;
        height = 14.68;

        volume = Math.PI * Math.pow(radius,2) * height;

        totalSurfaceArea = (Math.PI * Math.pow(radius,2)) + (Math.PI * radius * height);

        System.out.println("Volume of cylinder = " + volume + " cm^3");
        System.out.println("Total Surface Area of cylinder = " + totalSurfaceArea + " cm^2");

    }
}