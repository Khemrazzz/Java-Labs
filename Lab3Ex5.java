/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 5: Write a program that accepts a temperature. If the temperature is less than zero, the program prints
“ICE”. If the temperature is between 0 and 100, the programs prints “WATER”. If the
temperature is above 100, the program prints “VAPOUR”.
*/

import java.io.*;
import java.util.Scanner;

public class Lab5Ex5{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double temp = 0.0;

        System.out.print("Enter the value of temperature = ");
        temp = input.nextDouble();

        input.close();

        if (temp < 0)
        System.out.println("ICE");
        else
        if ((temp >= 0) && (temp <= 100))
        System.out.println("WATER");
        else 
        System.out.println("VAPOUR");

    }
}










