package day10;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> ob = Optional.empty();
        if(ob.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println("not empty");
        }
        if(ob.isPresent()){
            System.out.println("empty");
        }
        else {
            System.out.println("not empty");
        }
        ob= Optional.of("Ramu");
        if(ob.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println("not empty");
        }
        if(ob.isPresent()){
            System.out.println("empty");
        }
        else {
            System.out.println("not empty");
        }

        System.out.println(ob.get());
        ob= Optional.of("Bharath");
        System.out.println(ob.get());
    }
}
