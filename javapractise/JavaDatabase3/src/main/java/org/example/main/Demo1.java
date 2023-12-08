package org.example.main;

import org.example.assets.PreDefinedConstants;
import org.example.dao.StudentDao;
import org.example.to.StudentTO;

import java.time.LocalDate;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int ch = 0;

        StudentDao sdo;
        try {
            sdo = new StudentDao();
            StudentTO to= new StudentTO();
            do {
                System.out.println("0: Exit 1: Display All 2 : Add Data 3 : Update Details" );
                ch = Integer.parseInt(PreDefinedConstants.sc.nextLine());
                switch(ch){
                    case 0:
                        System.out.println("Program ended");
                        break;
                    case 1:
                        List<StudentTO> ls= sdo.readAllStudents();
                        ls.stream().forEach(System.out::println);
                        break;
                    case 2 :
                        System.out.println("Enter student detls ");
                        to.setSid(PreDefinedConstants.sc.nextLine());
                        to.setFname(PreDefinedConstants.sc.nextLine());
                        to.setLname(PreDefinedConstants.sc.nextLine());
                        to.setDob(LocalDate.parse(PreDefinedConstants.sc.nextLine()));
                        System.out.println(sdo.insertStudentData(to));
                        break;
                    case 3:
                       // System.out.println("Enter the sid of student to update ");
                        //String s;
                       // s=PreDefinedConstants.sc.nextLine();
                        System.out.println("Enter the student details to update. Enter SID ");
                        to.setSid(PreDefinedConstants.sc.nextLine());
                        System.out.println("Enter the First name");
                        to.setFname(PreDefinedConstants.sc.nextLine());
                        System.out.println("Enter the last name");
                        to.setLname(PreDefinedConstants.sc.nextLine());
                        System.out.println("Enter the Date");
                        to.setDob(LocalDate.parse(PreDefinedConstants.sc.nextLine()));
                        System.out.println(sdo.UpdateStudentData(to));
                        break;
                }
            } while (ch != 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

