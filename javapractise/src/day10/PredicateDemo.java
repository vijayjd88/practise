package day10;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Integer[] a={22,4,6,77,8,9,66,23};
        Predicate<Integer> p1 = (x)->(x%2==0);
        if(p1.test(3)){
            Consumerdemo.ob1.accept("even");
        } else {
            Consumerdemo.ob1.accept("Odd");
        }
        for(Integer x : a)if(p1.test(x)) Consumerdemo.ob1.accept(x);

    }
}
