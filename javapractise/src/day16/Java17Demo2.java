package day16;

import day2.Read;

public class Java17Demo2 {
    public static void main(String[] args) {
        String s1, s2, s3 ;
        System.out.println("Enter name, city and DOB");
        s1= Read.sc.nextLine();
        s2= Read.sc.nextLine();
        s3= Read.sc.nextLine();
        String s4 = """
                {" name" : " %s",
                 " city" : "%s",
                 "dob" : "%s"
                }
                """;
        System.out.println(s4.formatted(s1,s2,s3));

    }
}
