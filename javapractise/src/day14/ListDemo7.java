package day14;
import java.util.*;
public class ListDemo7 {
    public static void main(String[] args) {
      Queue<Integer> q1=new LinkedList<>();
      q1.add(30);
      q1.add(7);
      q1.add(10);
      q1.add(110);
        System.out.println(q1);
        Integer a1= q1.remove();
        System.out.println(a1);
        System.out.println(q1);
        a1= q1.remove();
        System.out.println(a1);
        System.out.println(q1);
        q1.add(220);
        a1= q1.remove();
        System.out.println(a1);
        System.out.println(q1);
    }
}
