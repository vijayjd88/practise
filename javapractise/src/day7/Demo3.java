package day7;

import day2.Read;

public class Demo3 {

    public static void main(String[] args) {
        Airthmatic [] obj = new Airthmatic[4]; // create 4 refernce to Airthmatic class
        obj[0]= new Addition();
        obj[1] = new Subtraction();
        obj[2]= new Multiplication();
        obj[3]= new Division();
        int ch;
        System.out.println("Enter choice 1-Add 2-Sub 3- Mul 4-Div");
        ch = Read.sc.nextInt();
        Demo2.call(obj[ch-1]);// Delegate



    }

}
