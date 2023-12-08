package org.example.main;

import org.example.dao.StudentMarksDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Arrays;

public class JoinDemo2 {
    public static void main(String[] args) {
        try {
            StudentMarksDAO sdmo = new StudentMarksDAO();
            ResultSet rs = sdmo.getStudentMarks();
            ResultSetMetaData md=rs.getMetaData();
            // Note : ResultSetMetaData will be successful only after executing the query
            String heading="";
            for(int i=1;i<=md.getColumnCount();i++){
                heading = heading + md.getColumnLabel(i)+ " ";
            }
            System.out.println(heading);
            String sid= "";
            while(rs.next()){

                    if(!sid.equals(rs.getString(1))){
                        System.out.println(rs.getString(1) + " " + rs.getString(2));
                        System.out.println("-".repeat(80));
                        sid=rs.getString(1);
                    }

                System.out.println(" \t\t\t\t\t"+rs.getString(3) + "\t\t\t\t"+ rs.getString(4)+"\t\t\t\t"+ rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
