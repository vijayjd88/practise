package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

    public static Connection co=null;
    public static Connection getConnection() throws Exception {
        if(co==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            co=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root1234");
            co.setAutoCommit(false);
        }
        return co;
    }


        }


        //public static Connection co=null;
//public static Connection getConnection(){
        // if(co==null){
//        Class.forName("className:com.mysql.cj.jdbc.Driver");
//
//        }