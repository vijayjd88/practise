package day10;

import java.time.LocalDate;
import java.util.Optional;

public class StudentDemo {
    public static void main(String[] args) {
        Student ob = new Student("Ram","Bng", LocalDate.parse("1992-09-08"));
        System.out.println(ob);
        Optional<Student> stud = Optional.of(ob);
        if(stud.isPresent()) System.out.println(stud.get().getFname());
    }
}
