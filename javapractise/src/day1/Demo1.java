package day1;
/*
  When we create a new class java.lang.* will be imported automatically
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1="10";
        int a=10;
        Integer b=Integer.valueOf(s1);
        System.out.println("The value of a : "+a );
        System.out.println("The value of b : "+b.byteValue());
        System.out.println("Binary value : "+Integer.toBinaryString(b));
        System.out.println("Octal Value : " +Integer.toOctalString(b));
        System.out.println("The biggest value we can store in int is : " + Integer.MAX_VALUE );
    }
}
