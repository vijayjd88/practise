package day8.Assignment;

import day2.Read;

import java.util.Scanner;

public class ReverseData {

    public static void main(String[] args) {

        System.out.println("Enter the input data to be reversed : ");
        String input = Read.sc.nextLine();
        StringBuilder data = new StringBuilder();
        //System.out.println(data);
        data.append(input);
        data.reverse();
        System.out.println(data);
    }
}