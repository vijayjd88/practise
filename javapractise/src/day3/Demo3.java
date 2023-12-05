package day3;

import java.util.Arrays;

public class Demo3 {

    public static void main(String[] args) {

        String s1 = "This is a book";
        String s2= Arrays.toString(s1.split(" "));
        System.out.println(s2);// {[this , is ]}
       /* for(int i = 0 ; i<s2.length;i++){
            System.out.println(s2[i]);
        }*/
        String sql = "select fname, lname from sdetail";

        String tname[] = sql.split("from");

        System.out.println("table name is " +  tname[1]);
        String cname[] = tname[0].split("select");
        String cname1[] = cname[1].split(",");
        System.out.println("columns are : ");
        for(int i = 0 ; i < cname1.length;i++){
            System.out.println(cname1[i]);
        }

    }
    // Q : given select fname, lname form sdetail
    // write a split command to print table name
    // write a split command to print column name
}
