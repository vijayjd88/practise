package day18;

import java.util.Locale;
import java.util.*;
import java.util.stream.Stream;

public class DemoLocale {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
        Locale lo=Locale.getDefault();
        System.out.println(lo + " "+ lo.getCountry()+ lo.getDisplayCountry());
        Locale[] lo1= Locale.getAvailableLocales();
        Stream.of(lo1).forEach(System.out::println);
        Stream.of(lo1).forEach((x)->{
            System.out.println(x + " : " +x.getCountry()+ " Country name : " + x.getDisplayCountry());
        });
    }
}
