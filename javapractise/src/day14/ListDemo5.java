package day14;
import java.time.LocalDate;
import java.util.*;
import day10.Student;
public class ListDemo5 {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student("Sachin", "Mumbai", LocalDate.parse("1974-04-24")));
        list.add(new Student("Rahul", "Bangalore", LocalDate.parse("1973-05-20")));
        list.add(new Student("Sourav", "Calcutta", LocalDate.parse("1972-06-30")));
        list.add(new Student("Srikanth", "Chennai", LocalDate.parse("1964-06-24")));

        list.forEach(System.out::println);

        //Printing only the name

        list.stream().map((x)->(x.getFname())).forEach(System.out::println); // value of x is being mapped to First name of Student
        list.stream().filter((a)->(a.getFname().charAt(0)=='R')).forEach(System.out::println);
    }
}
