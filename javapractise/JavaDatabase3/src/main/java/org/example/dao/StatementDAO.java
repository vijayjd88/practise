package org.example.dao;

import org.example.to.StudentTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class StatementDAO {
    private Connection con;
    Statement st;
    public StatementDAO() throws Exception{
        con=DbConnect.getConnection();
        st=con.createStatement();
    }

    public ResultSet readAllData() throws Exception{

        ResultSet rs= st.executeQuery("SELECT * FROM sdetails");
        return rs;
    }
    public StudentTO getStudent(String id) throws Exception{
        ResultSet rs= st.executeQuery(" SELECT * FROM sdetails where sid= '" +id+ "'" );
       //  ResultSet rs1=st.executeQuery("SELECT * FROM sdetails where fname='" +fname+"'"); // For String we use single quote within  ""
        if(rs.next())
            return new StudentTO(rs.getString(1),rs.getString(2),rs.getString(3), (LocalDate.parse(rs.getString(4))));
        else
            throw new Exception("ID does not exist");

    }
    public String updateStudent(StudentTO st1) throws Exception{
       StudentTO st= getStudent(st1.getSid());
       String query="Update sdetails set fname='"+((st1.getFname().isEmpty())?st.getFname():st1.getFname())+ "', lname ='"
               +((st1.getLname().isEmpty())?st.getLname():st1.getLname())+"'," +
               "dob='"+((st1.getDob().toString()==null)?st.getDob():st1.getDob())+"' where sid = '"+st.getSid()+"'";
        System.out.println(query);
        this.st.executeUpdate(query);
       /*if(st1.getFname().isEmpty()){
           st1.setFname(st.getFname());
        }
        if(st1.getLname().isEmpty()){
            st1.setFname(st.getFname());
        }
        if(String.valueOf(st1.getDob())== null){
            st1.setFname(st.getFname());
        }
        if(st1.getFname().isEmpty()){
            st1.setFname(st.getFname());
        }*/
        return " Record Updated";
    }
    public String save() throws Exception{
        con.commit();
        return " Data is saved";
    }

    public String rollback() throws Exception{
        con.rollback();
        return " Rollback successful ";
    }
}
