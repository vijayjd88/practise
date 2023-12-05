package day16;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Java17Demo11 {

    public static void main(String[] args) {
        record Demo(String fname,String city, LocalDate dob){};
        var n1= Stream.of(new Demo("Abc", " Blr", LocalDate.parse("1999-01-01")), new Demo("Vijay", " Blr", LocalDate.parse("1988-06-28")));
       /* n1.forEach(
                System.out::println
        );*/
        n1.toList().stream().map((x)->(x.fname)).forEach(System.out::println);
    }
}
