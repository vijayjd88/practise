package day3;

import java.util.StringTokenizer;

public class Demo4 {

    public static void main(String[] args) {

        String s1 = "This is a book,book2.com";

        StringTokenizer  st = new StringTokenizer(s1," ,.");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


    }
}
