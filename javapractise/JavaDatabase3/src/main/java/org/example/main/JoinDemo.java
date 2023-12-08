package org.example.main;

import org.example.dao.StudentMarksDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JoinDemo {
    public static void main(String[] args) {
        try {
            StudentMarksDAO sdmo = new StudentMarksDAO();
            ResultSet rs = sdmo.getStudentMarks();
            ResultSetMetaData md=rs.getMetaData();
            // Note : ResultSetMetaData will be successful only after executing the query
            String heading="";
            for(int i=1;i<=md.getColumnCount();i++){
                heading = heading + md.getColumnName(i)+ " ";
            }
            System.out.println(heading);
            while(rs.next()){
                for(int i=1;i<=md.getColumnCount();i++){
                    System.out.println(rs.getString(i)+ " ");
                }
                System.out.println(" ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
