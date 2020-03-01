/*
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your decimal number: ");
        int a = scan.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(a));//
    }
}
