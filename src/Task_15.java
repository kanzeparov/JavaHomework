import java.util.Scanner;
/*
Write a Java program to swap two variables.
 */

public class Task_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first variable int: ");
        int a = scan.nextInt();
        System.out.println("Input second variable int: ");
        int b = scan.nextInt();
        System.out.println("Variables BEFOR swapping: " + a + " and " +  b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Variables AFTER swapping: " + a + " and " +  b);
    }
}
