/*
Author: Khemrazzz
*Java programming*
*Basic Input/Output*
*Using Scanner Class*

Question 7: Write a Java program to enter the speed of a moving car and the time it has been traveling.
Calculate and print the distance travelled by the car.

*Formula List*

Distance = Speed * Time
*/

import java.io.*;
import java.util.Scanner;

public class Lab2Ex7{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double speed, time, distance = 0.0;

        System.out.print("Enter the speed (km per hour) of the car = ");
        speed = input.nextDouble();
        System.out.print("Enter the time taken (in hours) by the car = ");
        time = input.nextDouble();

        input.close();

        distance = speed * time;

        System.out.println("The distance covered by the car = " + distance + " km");
        
    }
}