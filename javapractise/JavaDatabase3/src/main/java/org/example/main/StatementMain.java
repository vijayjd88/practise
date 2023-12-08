package org.example.main;

import org.example.assets.PreDefinedConstants;
import org.example.dao.StatementDAO;
import org.example.to.StudentTO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;

public class StatementMain {
    public static void main(String[] args) {
        StatementDAO stmt=null;
        StudentTO student=null;
        int ch=0;
        try{
            stmt=new StatementDAO();
            student=new StudentTO();
            ResultSet rs =null;
         do {
             System.out.println(" Enter 0: Exit, 1 :Display All, 2: Display id wise 3: Update 4: Save 5 : Rollback");
             ch=Integer.parseInt(PreDefinedConstants.sc.nextLine());

             switch(ch)
             {
                 default :
                     System.out.println("Program ended");
                     break;
                 case 1: rs=stmt.readAllData();
                     ResultSetMetaData md=rs.getMetaData();
                     // Note : ResultSetMetaData will be successful only after executing the query
                     String heading="";
                     for(int i=1;i<=md.getColumnCount();i++){
                         heading = heading + md.getColumnName(i)+ " ";
                     }
                     System.out.println(heading);
                 while(rs.next())
                 {
                     System.out.println(rs.getString(1)+ " "+ rs.getString(2)+
                             " "+ rs.getString(3)+ " "+ rs.getString(4)
                     );
                 }
                 break;

                 case 2 :
                     System.out.println("Enter the student id to display : ");
                     student=stmt.getStudent(PreDefinedConstants.sc.nextLine());
                     System.out.println(student);
                     break;

                 case 3:
                     System.out.println("Enter StudentID, fname, lname, DOB which has to be changed : ");
                     student.setSid(PreDefinedConstants.sc.nextLine());
                     student.setFname(PreDefinedConstants.sc.nextLine());
                     student.setLname(PreDefinedConstants.sc.nextLine());
                     String s2=PreDefinedConstants.sc.nextLine();
                     if(!(s2.isEmpty()))student.setDob(LocalDate.parse(s2));
                     System.out.println(stmt.updateStudent(student));
                 case 4 :
                     System.out.println(stmt.save());
                 case 5 :
                     System.out.println(stmt.rollback());
             }
         }while(ch!=0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
