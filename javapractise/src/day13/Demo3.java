package day13;

import day10.Student;
import day2.Read;

import java.io.*;
import java.time.LocalDate;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("/home/ubuntu/Desktop/Handson/corejava/corejavahandson/javapractise/src/student"));

            Student[] stud = new Student[5];
            int i = 0;
            String x;
            while ((x = br.readLine()) != null) {
                String[] s1 = x.split(",");
                stud[i++] = new Student(s1[0].trim(), s1[1].trim(), LocalDate.parse(s1[2].trim()));
            }
            // Assignment : Accept the choice 1 or 2, if 1 print data on screen, if 2 generate a report in file
            System.out.println("Enter choice 1 or 2 - 1: Screen 2- Report on file");
            int ch= Read.sc.nextInt();
            if(ch==1) {
                for (Student y : stud) {
                    System.out.println(y);
                }
                br.close();
            }
            else{
                BufferedWriter bw= new BufferedWriter(new FileWriter("/home/ubuntu/Desktop/Handson/corejava/corejavahandson/javapractise/src/file3.txt"));
                bw.write("STUDENT REPORT: "+"\n");
                bw.write("-".repeat(80));
                bw.newLine();
                bw.newLine();
                String data= "Name " +" ".repeat(21) +"City " +" ".repeat(21) + "Date of Birth\n";
                bw.write(data);
                bw.write("-".repeat(80));
                bw.newLine();
                for(Student z : stud){
                    data = z.getFname()+" ".repeat((26-z.getFname().length()))+z.getCity()+ " ".repeat((26-z.getCity().length()))+z.getDob()+"\n";
                    bw.write(data);
                }
                bw.write("-".repeat(80));
                bw.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        br.close();
        }
    }
}