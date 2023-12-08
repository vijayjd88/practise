package org.example;

import junit.framework.TestCase;
import org.example.dao.DbConnect;
import org.example.dao.StudentDao;
import org.example.to.StudentTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
 Connection co;
   @Test
    public void testCase1(){

       try{
           Connection co = DbConnect.getConnection();
       }catch(Exception e){
           Assertions.fail();
       }
   }

    @Test
    public void testCase2(){

        try{
            StudentDao studentDao= new StudentDao();
            List<StudentTO> l1=studentDao.readAllStudents();
            Assertions.assertNotNull(l1);
            Assertions.assertEquals(l1.get(0).getFname(),"Rahul");
        }catch(Exception e){
            Assertions.fail();
        }
    }

    @Test
    public void testCase3(){

        try{
            StudentDao studentDao= new StudentDao();
            String l1=studentDao.insertStudentData( new StudentTO("s1007","Vijay","Durai", LocalDate.parse("1988-06-28")));
            //co.rollback();
            Assertions.assertEquals(l1, "Record Added");


        }catch(Exception e){
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @Test
    public void testCase4(){

        try{
            StudentDao studentDao= new StudentDao();
            String l1=studentDao.UpdateStudentData(new StudentTO("s1001", "Varun", "Tendulkar",LocalDate.parse("1974-04-04")));
            Assertions.assertEquals(l1, "Record Updated");

        }catch(Exception e){
            Assertions.fail();
        }
    }


}
