/*
Write a Java program to convert a decimal number to octal number. Go to the editor
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17
 */

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your decimal number: ");
        int a = scan.nextInt();
        System.out.println(Integer.toOctalString(a));
    }
}
