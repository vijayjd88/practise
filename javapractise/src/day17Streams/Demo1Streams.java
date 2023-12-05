package day17Streams;
import java.util.*;
import java.util.stream.Collectors;

public class Demo1Streams {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{
                12,10,15,51,7,77,30,35,40,45,46,48,94
        };

        //How to convert an array into a collection
        List<Integer> sl= Arrays.asList(arr);
        System.out.println(sl);
        sl.stream().forEach(System.out::println);

        //using Filters which contain predicates
        //Displaying all data>40
        System.out.println(" Using Filters");
        sl.stream().filter((x)->(x>40)).forEach(System.out::println);
        //How to print number of elements in a collection
        System.out.println("Using size ");
        System.out.println(sl.size());
        int count =(int)sl.stream().filter((x)->(x>40)).count();
        System.out.println(count);
        //Note: By default count returns a long value
        Long c1=sl.stream().filter((x)->(x>40)).count();
        // How to extract the values instead of counting (To create a seperate List)
        System.out.println(" Seperate List");
        List<Integer> l2 = sl.stream().filter((x)->(x>40)).collect(Collectors.toList());
        System.out.println("Sum of List ");
        Integer l3=sl.stream().reduce(0,Integer::sum);
        System.out.println(l3);
        System.out.println("Sum of List > 40");
        l3= sl.stream().filter((x)->(x>40)).reduce(0,Integer::sum);
        System.out.println(l3);
        System.out.println(" Displaying the streams using user defined functions ");
        l3=sl.stream().filter((x)->(x>40)).reduce(0, Demo1Streams::f1);// reduce function recurcively calls the f1 function
        System.out.println(l3);

        System.out.println("Find mean of the given numbers");
        Double l4=sl.stream().mapToDouble((x)->(x)).reduce(0,Demo1Streams::f2);
        System.out.println(l4);
    }

    public static Integer f1(Integer num, Integer num2){
       /* int sum=0;
        System.out.println(num + " = " +num2);
        sum+=num+num2; */
        return num+num2;
    }
    public static Double f2(Double num, Double num2){
       /* int sum=0;
        System.out.println(num + " = " +num2);
        sum+=num+num2; */
        return (num+num2)/2;
    }
}
