/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 9: Write a program to convert a temperature in degrees Celsius to degrees Fahrenheit. Use the
formula Fahrenheit = 9xCelsius/5 + 32.

*Formula List*

Fahrenheit = 9xCelsius/5 + 32.
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex9{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double celcius, fahrenheit = 0.0;

        System.out.print("Enter degrees in celcius = ");
        celcius = input.nextDouble();

        input.close();

        fahrenheit = (9 * (celcius / 5)) + 32;

        System.out.println(celcius + " degrees celcius is equal to " + fahrenheit + " degrees fahrenheit");
        
    }
}