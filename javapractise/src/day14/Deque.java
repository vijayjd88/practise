package day14;
import java.util.*;
public class Deque {
    public static void main(String[] args) {

        //Deque<Integer> d1= new LinkedList<>();
        java.util.Deque<Integer> d1= new ArrayDeque<>();
        d1.push(7);
        d1.push(8);
        System.out.println(d1);
        System.out.println(d1.pop());
        System.out.println(d1);
        d1.push(11);
        System.out.println(d1);
        System.out.println(d1.pop());
        System.out.println(d1);
        d1.push(21);
        d1.add(41);// adds elements at the bottom
        System.out.println(d1);
        //d1.remove();
        System.out.println(d1.remove());// remove and pop have same functionality
        System.out.println(d1);
        System.out.println(d1.peek()); //Only to see the uppermost value
        System.out.println(d1);

        // In a day, only five leaves are allocated(In 1 day only 5 employees can apply for leave)
        //Create an application to receive the employee name and allocate leave for the first 5 members
        //if their leave is pending
    }
}
