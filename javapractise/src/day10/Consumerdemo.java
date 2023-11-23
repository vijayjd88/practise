package day10;
import java.util.function.Consumer;
public class Consumerdemo {
    public static Consumer<Object> ob1 = (x)->{System.out.println(x);};
    public static void main(String[] args) {
        Consumer<Integer> ob = (x)->{
            System.out.println(x); };

         ob.accept(10);
         ob1.accept("King");
         ob1.accept(10.2f);
    }
}
