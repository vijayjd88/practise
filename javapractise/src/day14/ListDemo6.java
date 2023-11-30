package day14;

import day10.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListDemo6 {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student("Sachin", "Mumbai", LocalDate.parse("1974-04-24")));
        list.add(new Student("Rahul", "Bangalore", LocalDate.parse("1973-05-20")));
        list.add(new Student("Sourav", "Calcutta", LocalDate.parse("1972-06-30")));
        list.add(new Student("Srikanth", "Chennai", LocalDate.parse("1964-06-24")));

        list.forEach(ListDemo6::f1);
    }

    public static void f1(Student x){
        System.out.println(x.getFname());
    }
}
