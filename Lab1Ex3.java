/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 3: Write a Java program to declare the variable radius of a circle of type double. Assign values
to the variable. The program must calculates and prints the circumference and area.

*Formula List* 'Let r = radius'

Circumference = 2 * Pi * r
In java = 2 * Math.PI * r

Area = Pi * r^2
In java = Math.PI * Math.pow(r,2)
*/

import java.io.*;

public class Lab1Ex3{
    public static void main(String args[]){

        double radius, circumference, area = 0.0;

        radius = 5.5;

        circumference = 2 * Math.PI * radius;

        area =  Math.PI * Math.pow(radius, 2);

        System.out.println("Circumference of circle = " + circumference + " cm");
        System.out.println("Area of circle = " + area + " cm^2");
    }
}