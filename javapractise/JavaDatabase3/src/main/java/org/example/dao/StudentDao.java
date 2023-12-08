package org.example.dao;

import org.example.to.StudentTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
   Connection connection;

    public StudentDao() throws Exception{
        this.connection=DbConnect.getConnection();
    }


    public List<StudentTO> readAllStudents () throws Exception{
        PreparedStatement ps= connection.prepareStatement("SELECT * FROM sdetails"); // For every new query we have to create a new Prepared Statement
        ResultSet rs=ps.executeQuery();
        List<StudentTO> ls= new ArrayList<>();
        while(rs.next()){
            StudentTO ob=new StudentTO();
            ob.setSid(rs.getString(1));
            ob.setFname(rs.getString(2));
            ob.setLname(rs.getString(3));
            ob.setDob(LocalDate.parse(rs.getString(4)));
            ls.add(ob);
        }

        return ls;
    }
    public String insertStudentData(StudentTO student) throws Exception{

        PreparedStatement ps=connection.prepareStatement("INSERT INTO sdetails VALUES (?,?,?,?)");
        ps.setString(1,student.getSid());
        ps.setString(2,student.getFname());
        ps.setString(3,student.getLname());
        ps.setString(4,String.valueOf(student.getDob()));
        ps.executeUpdate();
        return "Record Added";
    }
    public String UpdateStudentData(StudentTO student) throws Exception{

        PreparedStatement ps=connection.prepareStatement("UPDATE sdetails SET fname=?,lname=?, dob=? where sid=?");
        ps.setString(1,student.getFname());
        ps.setString(2,student.getLname());
        LocalDate dt=student.getDob();
        if(dt!=null) {
            ps.setString(3, String.valueOf(dt));
        }
        else{
            ps.setNull(3,Types.DATE);
        }
        ps.setString(4,student.getSid());
        ps.executeUpdate();
        return "Record Updated";
    }
}
