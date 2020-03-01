/* Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
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
        System.out.println(Integer.toHexString(a));
    }
}
