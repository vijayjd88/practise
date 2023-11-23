package day10;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDate> ob = ()->(LocalDate.now()) ;
        Consumerdemo.ob1.accept(ob.get());
    }
}
