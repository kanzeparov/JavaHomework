/*
Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17
 */

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int a = scan.nextInt();
        /* Первый способ решения задачи и самый быстрый
        System.out.println(Integer.toOctalString(a));
         */
        //Второй способ:
        int b = 0, i = 1;
        while (a > 0) {
            b = b + (i * (a % 8));
            a = a / 8;
            i = i * 10;
        }
        System.out.println("Octal number is: " + b);
    }
}
