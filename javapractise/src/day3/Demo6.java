package day3;

public class Demo6 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Arun");
        StringBuffer sb1 = sb;
        sb.append(" Delhi");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb.reverse());
        System.out.println(sb1);

    }
}
