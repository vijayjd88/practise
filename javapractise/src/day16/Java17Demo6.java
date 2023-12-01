package day16;


import day10.Student;

import java.time.LocalDate;

//use of instanceOf operator. This is the traditional way of using  instanceof operator.
public class Java17Demo6 {
    public static void main(String[] args) {

        Object s1= " Name ";
        Object s2= new Student(" Maharishi", " Nellore", LocalDate.parse("1985-01-01"));
        System.out.println(s1);
        System.out.println(s2);
        if(s1 instanceof String ){
            String temp=(String) s1;
            System.out.println(temp);
        }
        if(s2 instanceof Student){
            Student temp=(Student) s2;
            System.out.println(temp.getFname());
        }
    }
}
