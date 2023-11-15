package day3;

import day2.Addition;

public class Demo2 {
    public static void main(String[] args) {
        Addition ob = new Addition();

        String s1 = "ram";
        s1.toUpperCase();
        System.out.println(s1);
        s1=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1.length()); // number of character
        System.out.println(s1.charAt(0)); // first charter that is R
        System.out.println(s1.indexOf("A")); //starting pointion of the string here search from stating position
        System.out.println(s1.indexOf("M",2));// search from 3rd posion   -1

        //replace, replace all , startwith, compareTo
        System.out.println(s1.compareTo("RBM"));

    }
}
