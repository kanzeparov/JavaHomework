/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Task_13 {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 8.5;
        Double S = a * b;
        Double P = 2 * (a + b);
        System.out.println("Area is = " + S);
        System.out.println("Perimeter is = " + P);
    }
}
