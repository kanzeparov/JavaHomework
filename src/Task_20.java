/* Write a Java program to convert a decimal number to hexadecimal number.
        Input Data:
        Input a decimal number: 15
        Expected Output

        Hexadecimal number is : F
 */
import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your decimal number: ");
        int a = scan.nextInt();
        /* Первый способ решения задачи и самый быстрый:
        System.out.println(Integer.toHexString(a));
         */
        //Второй способ решения задачи:
        char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex = "";
        while(a > 0) {
            int b = a % 16;
            hex = ch[b] + hex;
            a = a / 16;
        }
        System.out.print("Hexadecimal number is : " + hex);
    }
}
