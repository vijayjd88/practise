package day13;

import day2.Read;

import java.io.File;
import java.io.RandomAccessFile;
//This program will convert all small 'a' to 'A' in the same file.
// When we read 'a' from the file, the file pointer moves to the next character. If I overwrite it will
// overwrite the next character next to 'a', which is wrong
//Before overwriting, we have to take the file pointer back.
//File pointer is a long variable. How many characters we move, we keep track on file pointer.

public class Demo5 {
    public static void main(String[] args) throws Exception {
        try {

            System.out.println("Enter filename to be checked : ");
            String f1 = Read.sc.nextLine();
            File file = new File(f1);
            long filepointer =0L;
            RandomAccessFile rm= new RandomAccessFile(file, "rw");
            int x=0;
            while((x= rm.read())!=-1){
                if (x==97){
                    rm.seek(filepointer);
                    rm.write(65);
                }
                filepointer++;
            }
            System.out.println("Processing Over ");
            rm.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{

        }
    }
}