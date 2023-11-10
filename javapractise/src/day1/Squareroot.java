package day1;
import java.lang.Math;
import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        double n=sc.nextInt();
        System.out.println("Square root of given number " + n + " is " + Math.sqrt(n));
    }
}
