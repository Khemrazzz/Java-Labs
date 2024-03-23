/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 5: Write a Java program to declare the length, width and height of a cuboid of type double.
Assign values to the variables. The program must calculates and prints the volume and total
surface area.

*Formula List* 'Let l = length, w = width and h = height'

Volume = l * w * h

Total Surface Area = 2 * l * w + 2 * w * h + 2 * l * h
*/

import java.io.*;

public class Lab1Ex5{
    public static void main(String args[]){

        double length, width, height, volume, totalSurfaceArea = 0.0;

        length = 13.88;
        width = 5.43;
        height = 3.23;

        volume = length * width * height;

        totalSurfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * height);

        System.out.println("Volume of couboid = " + volume + " cm^3");
        System.out.println("Total Surface Area = " + totalSurfaceArea + " cm^2");

    }
}





