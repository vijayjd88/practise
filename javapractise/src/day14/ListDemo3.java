package day14;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(90);
        list.add(80);
        list.add(100);
        list.add(65);
        System.out.println(list);

        //Using Algorithms

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
