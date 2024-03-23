/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 8: Write a program to convert a temperature in degrees Fahrenheit to degrees Celsius. Use the
formula Celsius = 5× (Fahrenheit - 32) / 9.

*Formula List*

Celsius = 5× (Fahrenheit - 32) / 9.
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex8{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double fahrenheit, celcius = 0.0;

        System.out.print("Enter degrees in fahrenheit = ");
        fahrenheit = input.nextDouble();

        input.close();

        celcius = (5 * (fahrenheit - 32) / 9);

        System.out.println(fahrenheit + " degrees fahrenheit is equal to " + celcius + " degrees celcius");

    }
}

