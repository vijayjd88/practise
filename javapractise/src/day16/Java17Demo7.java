package day16;


import day10.Student;

import java.time.LocalDate;

//use of instanceOf operator
public class Java17Demo7 {
    public static void main(String[] args) {

        Object s1= " Name ";
        Object s2= new Student(" Maharishi", " Nellore", LocalDate.parse("1985-01-01"));
        System.out.println(s1);
        System.out.println(s2);
        if(s1 instanceof String temp ){
            System.out.println(temp);
        }
        if(s2 instanceof Student temp){
            System.out.println(temp.getFname());
        }
    }
}
