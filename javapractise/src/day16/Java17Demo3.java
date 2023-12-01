package day16;

import day10.Student;
import day2.Read;
//import org.json.simple.JSONArray;
import java.time.LocalDate;

public class Java17Demo3 {
    public static void main(String[] args) {
        String s4= """
                """;
        for(int i=0;i<3;i++) {
            System.out.println("Enter name, city and DOB");
            Student s1 = new Student(Read.sc.nextLine(), Read.sc.nextLine(), LocalDate.parse(Read.sc.nextLine()));
            s4 = s4 + """
                    {" name" : " %s",
                     " city" : "%s",
                     "dob" : "%s"
                    }
                    """.formatted(s1.getFname(), s1.getCity(), s1.getDob());
        }
        System.out.println(s4);

    }
}
