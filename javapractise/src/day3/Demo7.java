package day3;

import day2.Read;

public class Demo7 {
    public static void main(String[] args) {
        //  to check a inter is polindrom or not
        int a ;
        System.out.println("enter number ");
        a = Read.sc.nextInt();
        StringBuffer b1 = new StringBuffer(String.valueOf(a));
        b1.reverse();

        if(a == Integer.parseInt(b1.toString())) {
            System.out.println("polindrom");
        }
        else {
                System.out.println("not polindrom");
            }

        if( String.valueOf(a).equals(b1.toString())) {
            System.out.println("polindrom");
        }
        else {
            System.out.println("not polindrom");
        }

    }
}
