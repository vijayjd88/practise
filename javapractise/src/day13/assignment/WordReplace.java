// Assignment for replacing a word with given word in a file
package day13.assignment;

import day2.Read;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class WordReplace {

    public static void main(String[] args) {

        try {
            System.out.println("Enter the file to be checked ");
            String path=Read.sc.nextLine();
            File file1=new File(path);
            File file2=new File("/home/ubuntu/Desktop/Handson/corejava/corejavahandson/javapractise/src/student1");
            BufferedReader br= new BufferedReader(new FileReader(file1));
            BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
            System.out.println("Enter the word to be replaced");
            String fname=Read.sc.nextLine();
            System.out.println("Enter which word to replace with");
            String tname=Read.sc.nextLine();
            String linedata;
            while((linedata=br.readLine())!=null){
                bw.write(linedata.replaceAll("\\b"+ fname + "\\b",tname ));
                bw.newLine();
            }
            br.close();
            bw.close();
            Files.move(file2.toPath(),file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println(" Word replaced in file. Please check");
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
        }

    }
}
