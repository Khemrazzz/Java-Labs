/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class* 

Question 10: Given the lengths of two sides (b and c) of a triangle and the angle between them in degrees
(α), write a program to compute the length of the third side (c) using the following formula
(cosine rule) : 

A^2 = B^2 + C^2 - 2 * B * C * cos A

Hint: use the Math.pow(base,exponent) and Math.cos(angle)

*Formula List*

Length of side C^2 = A^2 + B^2 - 2 * A * B * cos C
In java = (Math.pow(A,2) + Math.pow(B,2) - 2 * A * B * Math.cos(60))Math.sqrt = c
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex10{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double a, b, c, deg, rad = 0.0;

        System.out.print("Enter length of side A = ");
        a = input.nextDouble();
        System.out.print("Enter length of Side B = ");
        b = input.nextDouble();
        System.out.print("Enter value of angle in degrees = ");
        deg = input.nextDouble();

        input.close();

        rad = Math.toRadians(deg); //angle should be converted from degrees to radians

        c = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)) - (2 * a * b * Math.cos(rad))); 

        System.out.println("The length of side C for the triangle = " + c + " cm");

    } 

}