package com.ysavchuk;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();
        System.out.println("Input second number: ");
        int b = scan.nextInt();
        System.out.println("Input third number: ");
        int c = scan.nextInt();
        int aver = (a + b +c)/3;
        System.out.println("Average = " + aver);
    }

}
