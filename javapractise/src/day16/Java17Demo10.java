package day16;

import java.time.LocalDate;

public class Java17Demo10 {
    public static void main(String[] args) {
        record Demo(String fname,String city, LocalDate dob){};
        var n1=new Demo("Abc", " Blr", LocalDate.parse("1999-01-01"));
        System.out.println(n1);
      // n1.fname("Ravichandran");
        System.out.println(n1.dob+ "\n" + n1.fname());
    }
}
