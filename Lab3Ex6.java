/*
Author: Khemrazzz
*Java programming*
*Selection*
*Using Scanner Class* 

Question 6: Write a program that accepts a character and print a colour according to the table given below.
character Output
R or r RED
B or b BLUE
Y or y YELLOW
G or g GREEN
W or w WHITE
K or k BLACK
O or o ORANGE
*/

import java.io.*;
import java.util.Scanner;

public class Lab3Ex6{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        char character;
        String data;

        System.out.print("Enter character = ");
        data = input.next();

        if (data.length() == 1){
        character = data.charAt(0);
        if ((character == 'R') || (character == 'r')) 
        System.out.println("RED");
        else if ((character == 'B') || (character == 'b')) 
        System.out.println("BLUE");
        else if ((character == 'Y') || (character == 'y')) 
        System.out.println("YELLOW");
        else if ((character == 'G') || (character == 'g')) 
        System.out.println("GREEN");
        else
        System.out.println("Invalid character");
        }else{
            System.out.println("Invalid character");
        }
        
        input.close();

    }
}