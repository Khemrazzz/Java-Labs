/*
Author: Khemrazzz
*Java programming*
*Basic Datatypes and Variables*

Question 1: Write a Java program to declare two variables base and height of a right angle triangle of type
double. Assign values to the variables. The program must calculates and prints the
hypotenuse, perimeter and area.

*Formula List* 'Let A = base and B = height'

Hypotenuse = C = 'Square-Root'(A^2 + B^2)
In java = Math.sqrt(A * A + B * B)

Perimeter = A + B + C 

Area = 0.5 * A * B 
*/

import java.io.*;

public class Lab1Ex1{
    public static void main(String args[]){

        double base, height, hypotenuse, perimeter, area = 0.0;

        base = 6.4;
        height = 12.5;

        hypotenuse = Math.sqrt((base * base) + (height * height));

        perimeter = base + height + hypotenuse;

        area = 0.5 * base * height;

        System.out.println("Hypotenuse of right angle triangle = " + hypotenuse + " cm");
        System.out.println("Perimeter of right angle triangle = " + perimeter + " cm");
        System.out.println("Area of right angle triangle = " + area + " cm^2");
    }

}
