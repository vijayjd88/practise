package day14.assignment;
import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(20);
        set.add(77);
        System.out.println(set);
        set.remove(5);
        System.out.println(set);
        //set.remove();
        //set.remove();
        Set<Integer> set1= new LinkedHashSet<>();
        set1.add(7);
        set1.add(98);
        set1.add(3);
        set1.add(7);
        set1.add(100);
        System.out.println();
        for (Integer x:set1) {
            System.out.println(x);
        }
        System.out.println(set1);
        //Take data from Array to set
        Integer [] ar=new Integer[]{47,7,10,11,87,9,10,47} ;
        Integer [] ar1=new Integer[]{47,7,10,10,47,1,34,62} ;

        List<Integer> l1= new ArrayList<>(Arrays.asList(ar));
        //Set<Integer> set2= (Set<Integer>) new ArrayList<>(Arrays.asList(ar1));
        System.out.println(l1);
        //System.out.println(set2);

            }
}