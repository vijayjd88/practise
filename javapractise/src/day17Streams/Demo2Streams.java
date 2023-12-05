package day17Streams;

import java.util.stream.Stream;

public class Demo2Streams {
    public static void main(String[] args) {
        String[] str = new String[]{"10", "5", "15", " 20", " 25"}; // here the data contains space that cannot be converted to number format, hence trim is used
        Integer s1 = Stream.of(str).mapToInt(x -> Integer.parseInt(x.trim())).reduce(0, Integer::sum);
        System.out.println(s1);
        Integer s2 = Stream.of(str).mapToInt(x -> Integer.parseInt(x.trim())).sum();
        System.out.println(s2);

    }
}