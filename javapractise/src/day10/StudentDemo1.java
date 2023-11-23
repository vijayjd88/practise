package day10;

import java.time.LocalDate;
import java.util.Optional;

public class StudentDemo1 {
    public static void main(String[] args) {
        Student ob = new Student("Krishan","Delhi", LocalDate.parse("1997-09-08"));

        Optional<Student> [] obj1= new Optional[]{Optional.of(ob)};

        Optional<Student> [] obj= new Optional[]{ Optional.of(new Student("Krishan","Delhi", LocalDate.parse("1997-09-08"))) ,Optional.of(new Student("Rukmini","Mathura", LocalDate.parse("2000-11-23"))),Optional.of(new Student("Balaram","Puri", LocalDate.parse("1997-11-27")))};

         for(Optional<Student> x: obj) System.out.println(x.get());
        System.out.println("------------------------------only name ");
        for(Optional<Student> x: obj) System.out.println(x.get().getFname());

        System.out.println("------------------------------today birth day ");
        for(Optional<Student> x: obj) if(ConstantLibrary.isBirthDay.test(x.get().getDob()))System.out.println(x.get());



    }
}
