package day3;

import day2.Read;

public class Demo1 {

    public static void main(String[] args) {

        String a1 = "Ram";
        String a2=a1;
        String a3 = new String("Ram");

       // System.out.println("enter Ram");
       // a2 = Read.sc.next();
a1= a1 + " Delhi ";
        if(a1 == a2) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


        if(a1 == a3) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        if(a1.equals(a3) ) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        if(a1.equals(a2) ) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a1);
    }
}
