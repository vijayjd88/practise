package day12;

import day2.Read;
import java.io.*;
public class Demo4 {
    public static void main(String[] args) {
        try {
            String filename;
            System.out.println("Enter file name with loc and extn to convert");
            filename = Read.sc.nextLine();
            FileInputStream f1 = new FileInputStream(filename);
            String tfilename;
            System.out.println("Enter filename to store");
            tfilename=Read.sc.nextLine();
            FileOutputStream f2=new FileOutputStream(tfilename);
            int byt;
            int i=0;
            while ((byt = f1.read()) != -1) {
                if(i++<=500) {// 500 bytes are the meta data in that file(for every file)
                    //System.out.print(byt);
                    f2.write(byt);
                }
                else {
                    f2.write(byt);
                    f2.write(byt);
                    f2.write(byt);
                    f1.read();
                    f1.read();
                }
            }

            f1.close();
            f2.close();
            System.out.println("--------------------Over------");

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
