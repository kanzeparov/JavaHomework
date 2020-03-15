/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class Task_11 {
    public static void main(String[] args) {
        double radius = 7.5, pi = 3.141592653589793238462643;
        double S = pi * (radius * radius);
        double P = 2 * pi * radius;
        System.out.println("Perimeter is = " + P);
        System.out.println("Area is = " + S);
    }
}
