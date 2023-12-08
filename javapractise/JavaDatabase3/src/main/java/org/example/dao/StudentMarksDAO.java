package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentMarksDAO {

    Connection co;
    ResultSet rs;

    public StudentMarksDAO() throws Exception{
        co=DbConnect.getConnection();
    }
    public ResultSet getStudentMarks() throws Exception{
        PreparedStatement ps=co.prepareStatement("SELECT a.sid,a.fname,b.testno,b.sub1marks as 'English'" +
                ",b.sub2marks as 'Math' from sdetails a inner join test b on a.sid=b.sid order by a.sid");
        return ps.executeQuery();
    }
}
