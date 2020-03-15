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
        /*Первый способ решения задачи и самый быстрый:
        System.out.println("Binary number is: " + Integer.toBinaryString(a));
         */
        //Второй способ решения
        StringBuffer binaryBuf = new StringBuffer();//Создаем расширяемую строку
        while (a > 0) {
            int b = a % 2;//Получаем остаток от деления на 2
            binaryBuf.append(b);//Записываем остаток в строку методом append (накоплением к предыдущему нового значения)
            a = a / 2; //Находим частное и присваиваем его числу(данная конструкция для избежания постоянного цикла и переполнения памяти)
        }
        String binaryNumber = binaryBuf.reverse().toString();//Запись в обычную строку в обратном порядке
        System.out.println(binaryNumber);
    }
}
