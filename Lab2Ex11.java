/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class* 

Question 11: Write a program that prompts the user for the Cartesian coordinates of two points (x , y) and (a, b)
and displays the distance between them computed using the following formula:

Distance = Square-root((A - X)^2 + (B - Y)^2)

*Formula List*

Distance = Square-root((A - X)^2 + (B - Y)^2) let (A - X) = Q AND (B - Y) = W
In java = Math.sqrt(Math.pow(Q,2) + Math.pow(W,2))
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex11{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double a, b, x, y, q, w, distance = 0.0;
    
        System.out.print("Enter the value of coordinate X = ");
        x = input.nextDouble();
        System.out.print("Enter the value of coordinate Y = ");
        y = input.nextDouble();
        System.out.print("Enter the value of coordinate A = ");
        a = input.nextDouble();
        System.out.print("Enter the value of coordinate B = ");
        b = input.nextDouble();
    
    
        q = (a - x);
        w = (b - y);
    
        distance = Math.sqrt(Math.pow(q,2) + Math.pow(w,2));
    
        System.out.println("Distance between the two points = " + distance);
        
    }
}