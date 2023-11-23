package day10;

import java.time.LocalDate;
import java.util.function.Predicate;

public class ConstantLibrary {

    public static final  Predicate<LocalDate> isBirthDay= (x) ->(x.getMonth()==LocalDate.now().getMonth() && x.getDayOfMonth() == LocalDate.now().getDayOfMonth());

    public static final  Predicate<LocalDate> isBirthDay1 = (x)->(x.withYear(LocalDate.now().getYear()).compareTo(LocalDate.now())==0);
}
