/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 8: Write a program that accepts a time as three integers (hr, mm, ss). The program should validate
the time and then prints whether the time entered is valid or not.
*/

import java.io.*;
import java.util.Scanner;

public class Lab3x8{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int hr, mm, ss = 0;

        System.out.print("Enter the value for hours : ");
        hr = input.nextInt();
        System.out.print("Enter the value for minutes : ");
        mm = input.nextInt();
        System.out.print("Enter the value for seconds : ");
        ss = input.nextInt();

        if (((hr >= 0) && (hr <= 23)) && ((mm >= 0) && (mm <= 59)) && ((ss >= 0) && (ss <= 59)))
        System.out.println("Time entered is valid.\nTime: " + hr + ":" + mm + ":" + ss);
        else 
        System.out.println("Invalid time!");

        input.close();
    }
}