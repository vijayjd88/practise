package day13;

import day2.Read;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter filename to be checked : ");
        String f1 = Read.sc.nextLine();
        File file = new File(f1);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    System.out.println("Given is a directory");
                    File[] s1 = file.listFiles();
                    for (File x : s1) {
                       // File file2 = new File(x);
                        if (x.isDirectory()) {
                            System.out.println(x + " ".repeat(25 - x.getName().length()) + "Directory" + x.getAbsolutePath());
                        } else {


                            System.out.println(x + " ".repeat(25 - x.getName().length()) + "File" + x.getAbsolutePath());
                        }
                    }
                } else {
                    System.out.println("Given is a file ");
                }
            } else {
                System.out.println("File/Folder does not exist ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
