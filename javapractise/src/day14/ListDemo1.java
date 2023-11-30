package day14;

import java.util.ArrayList;
import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {

        // ArrayList<Integer> list=new ArrayList<>(); This is tightly coupled, hence bad pract
        List<Integer> list= new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(100);
        list.add(65);
        System.out.println("----------------Displaying the list directly------");
        System.out.println(list);
        System.out.println("-----------------Displaying the list using index------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)); // wrong to use list[i]
        }
        System.out.println("Displaying the list using foreach loop--------");
        for(Integer x: list){
            System.out.println(x);
        }
        System.out.println("--------------Displaying the list using method ref----");
        //here we give ref of method, the loop will call the method with value
        list.forEach(System.out::println);
        System.out.println("-------------Disp list using static method ref-----------");
        list.forEach(ListDemo1::f1);

        System.out.println("-------------Disp list using instance method ref------");
        ListDemo1 obj=new ListDemo1();
        list.forEach(obj::f2);
        System.out.println("---------------Disp the list using Iterator interface---------");
        // It takes a copy from the list and displays one-by-one in forward direction. While navigation, I cannot do the changes
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            System.out.println(n);
        }
        ListIterator<Integer> it1=list.listIterator();
        while(it1.hasNext()){
            Integer n=it1.next();
            System.out.println(n);
        }
    }

    public static void f1(Integer a){
        System.out.println(a+"---->"+(a*a));
    }

    public void f2(Integer a){
        System.out.println(a+"   "+ Math.sqrt(a));
    }
}
