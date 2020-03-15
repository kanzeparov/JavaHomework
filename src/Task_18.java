/*
ite a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
Product of two binary numbers: 110
 */
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first binary int: ");
        int a = Integer.parseInt(scan.next(), 2);//преобразование строки в число в двоичной системе счисления
        System.out.println("Input second binary int: ");
        int b = Integer.parseInt(scan.next(), 2);
        System.out.println("Product of two binary numbers:" + Integer.toBinaryString(a * b));//возвращение строкового представления переданного числа в двоичной форме без лидирующих нулей
    }
}
