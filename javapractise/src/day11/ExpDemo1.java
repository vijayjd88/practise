package day11;

public class ExpDemo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 0;
        System.out.println("The program begins ");
        try {
            c = a / b;
            System.out.println(c);
            System.exit(0); //now finally will not execute
                                // no return or throws finally block is not necessary
                                //if throws
        } catch (ArithmeticException n) {
            System.out.println(n.getMessage());
        } catch (Exception n1) {
            System.out.println(n1.getMessage());
        }

        System.out.println("The program ends ");
    }

}
