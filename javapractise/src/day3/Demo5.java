package day3;

public class Demo5 {

    public static void main(String[] args) {
       // String reg = "[a].*";
       // String reg = ".[0-9].*";
       // String reg = ".*[@].*[.com|.in]";
       // String reg = "[a-zA-Z]{3}[0-9]{3}";
        //String reg =".*[^a-zA-Z0-9].*";
       // String reg =".*[^a-zA-Z0-9].*[A-Z] .*[0-9]";
       // String reg =".*[^a-zA-Z0-9].*";
        //String reg ="^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).+$";
        String reg ="^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,15}$";
        String reg1 =".*^[-_].*";
        String reg2 ="^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?!.*[@]).{8,15}$";
        String s1 = "abRc$12#j-@uhy";
        System.out.println(s1.matches(reg2));

    }
}
