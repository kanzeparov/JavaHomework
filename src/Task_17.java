package com.ysavchuk;
/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary int: ");
        int a = Integer.parseInt(sc.next(), 2);//преобразование строки в число в двоичной системе счисления
        System.out.println("Input second binary int: ");
        int b = Integer.parseInt(sc.next(), 2);
        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(a + b));//возвращение строкового представления переданного числа в двоичной форме без лидирующих нулей
    }
}
