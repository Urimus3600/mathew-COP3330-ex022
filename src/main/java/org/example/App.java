/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double uno, dos, tres, mas;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the first number: " );
        uno = input.nextDouble();
        System.out.print( "Enter the second number: " );
        dos = input.nextDouble();
        System.out.print( "Enter the third number: " );
        tres = input.nextDouble();

        if(uno != dos && uno != tres && dos != tres) {
            if(uno>dos && uno> tres){
                mas = uno;
            }
            else if(dos>uno && dos>tres){
                mas = dos;
            }
            else{
                mas = tres;
            }

            System.out.printf("The largest number is %.6f.",mas);
        }

    }
}
