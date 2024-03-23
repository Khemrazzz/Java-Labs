/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 6: Write a Java program to declare the radius of a sphere of type double. Assign values to the
variable. The program must calculates and prints the volume and total surface area.

*Formula List* 'Let r = radius'

Volume = 4/3 * Pi * r^3
In java = (4/3) * Math.PI * Math.pow(r,3)

Total Surface Area = 4 * Pi * r^2
In java = 4 * Math.PI * Math.pow(r,2)
*/

import java.io.*;

public class Lab1Ex6{
    public static void main(String args[]){

        double radius, volume, totalSurfaceArea = 0.0;

        radius = 5.56;

        volume = (4/3) * Math.PI * Math.pow(radius,3);

        totalSurfaceArea = 4 * Math.PI * Math.pow(radius,2);

        System.out.println("Volume of sphere = " + volume + " cm^3");
        System.out.println("Total Surface Area = " + totalSurfaceArea + " cm^2");
    }
}