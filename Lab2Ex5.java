/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 5: Write a Java program that inputs the length, width and height of a cuboid and calculates and
prints the volume and total surface area.

*Formula List* 'Let l = length, w = width and h = height'

Volume = l * w * h

Total Surface Area = 2 * l * w + 2 * w * h + 2 * l * h
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex5{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double length, width, height, volume, totalSurfaceArea = 0.0;

        System.out.print("Enter length of cuboid = ");
        length = input.nextDouble();
        System.out.print("Enter width of cuboid = ");
        width = input.nextDouble();
        System.out.print("Enter height of cuboid = ");
        height = input.nextDouble();

        input.close();

        volume = length * width * height;

        totalSurfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * width);

        System.out.println("Volume of cuboid = " + volume + " cm^3");
        System.out.println("Total surface Area of cuboid = " + totalSurfaceArea + " cm^2");
        
    }
}