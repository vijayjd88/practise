package day16;

import java.time.LocalDate;

public class Java17Demo9 {
    public static void main(String[] args) {
        var obj= new Student1(" Rakesh", "Blr", LocalDate.parse("1988-06-06"));
        var x=" Vjd ";
        System.out.println(x);
        // x=10; var does not support dynamic data typing

        System.out.println(obj.dob());
    }
}
