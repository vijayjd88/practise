package day1;

import java.util.Scanner;

public class AreaCircle
{
    public static void main(String[] args) {
        /* To compute area, diameter of a circle by taking radius from user*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = sc.nextInt();
        double a=3.14*r*r;
        System.out.println("Area = " +a);
    }
}
