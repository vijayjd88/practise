package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new FileReader("/home/ubuntu/Desktop/Handson/corejava/corejavahandson/javapractise/src/file1.txt"));
        BufferedWriter bw= new BufferedWriter(new FileWriter("/home/ubuntu/Desktop/Handson/corejava/corejavahandson/javapractise/src/file2.txt"));
        String x;
        try {
            while ((x = br.readLine()) != null) {
                int sum = 0;
                for (String y : x.split(",")) {
                    sum = sum + Integer.parseInt(y.trim());
                }
                x = x + "= " + sum;
                bw.write(x);
                bw.newLine();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        br.close();
        bw.close();
        System.out.println("Data Processing over ");
    }
}
