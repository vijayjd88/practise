package day12;

import day2.Read;
import java.io.*;
public class Demo3 {
    public static void main(String[] args) {
        try {
            String filename;
            System.out.println("Enter file name with loc and extn to display");
            filename = Read.sc.nextLine();
            FileInputStream f1 = new FileInputStream(filename);
            int byt;
            while ((byt = f1.read()) != -1) {
                System.out.println((char) byt);
            }
            f1.close();
            System.out.println("--------------------Over------");

        }
     catch(Exception e) {
        System.out.println(e);
    }
}
}
