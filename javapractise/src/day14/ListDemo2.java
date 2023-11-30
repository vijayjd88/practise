package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(90);
        list.add(80);
        list.add(100);
        list.add(65);
        System.out.println("-----Displaying the initial List--------");
        System.out.println(list);
        System.out.println("------Add element at the top-----");
        list.add(0,900);
        System.out.println(list);
        System.out.println("------Add element in between-----");
        list.add(3,45);
        System.out.println(list);
        System.out.println("---Add elememt at the bottom---");
        list.add(454);
        System.out.println(list);
        System.out.println("---Removing element from the list----");
        list.remove(0);
        System.out.println(list);
        System.out.println("---------Find element and remove that element -----");
        list.remove(list.indexOf(45));
        System.out.println(list);
        list.add(77);
        list.add(77);
        list.add(77);
        System.out.println(list);
        while(list.contains(77)){
            //list.remove(new Integer(77));
            list.remove(Integer.valueOf(77));
            //list.remove(list.indexOf(77));
        }
        System.out.println(list);
        list.clear();// To remove all elements
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
