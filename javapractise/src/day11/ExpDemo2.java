package day11;

public class ExpDemo2 {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        int c = 0;
        System.out.println("The program begins ");

        try {
            c = f1(a, b);
            System.out.println(c);
        }

        catch (ArithmeticException e) {
           System.out.println(e.getMessage());
        }

        catch (Exception n1) {
            System.out.println(n1.getMessage());
        }
        System.out.println("The program ends ");
    }
        public static int f1 ( int x, int y) throws Exception {
            return x / y;
        }

}