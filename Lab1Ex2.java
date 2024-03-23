/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 2: Write a Java program to declare two variable length and width of a rectangle of type double.
Assign values to the variables. The program must calculates and prints the perimeter and
area.

*Formula List* 'Let A = length and B = width'

Perimeter = 2 * (A + B)

Area = A * B 
*/

import java.io.*;

public class Lab1Ex2{
    public static void main(String args[]){

        double length, width, perimeter, area = 0.0;

        length = 14.85;
        width = 6.665;

        perimeter = 2 * ( length + width);

        area = length * width;

        System.out.println("Perimeter of rectangle = " + perimeter + " cm");
        System.out.println("Area of rectangle = " + area + " cm^2");
        
    }
}