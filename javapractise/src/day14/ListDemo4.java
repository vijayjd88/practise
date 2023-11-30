package day14;
import java.util.*;

public class ListDemo4 {
    public static void main(String[] args) {
        Integer [] ar=new Integer[]{47,7,10,11,87,9,10,47} ;
        Integer [] ar1=new Integer[]{47,7,10,10,47,1,34,62} ;

        //To take the data from Array to List

        List<Integer> l1= new ArrayList<>(Arrays.asList(ar)); //Using arrays API
        List<Integer> l2= List.of(ar1);
        System.out.println(l1);
        System.out.println(l2);

        // To add all elements of one collection to another

       // l1.addAll(l2);
         //l1.removeAll(l2);
        l1.retainAll(l2);
        System.out.println(l1);

    }
}
