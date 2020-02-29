package com.ysavchuk;

import java.util.Scanner;
/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

public class Task_5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input first number: ");
            int a = scan.nextInt();
            System.out.println("Input second number: ");
            int b = scan.nextInt();
            int pr = a * b;
            System.out.println(a  + " * " + b + " = " +  pr);
        }
    }
