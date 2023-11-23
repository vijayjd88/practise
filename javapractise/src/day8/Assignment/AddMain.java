package day8.Assignment;

import day2.Read;

public class AddMain {

    public static void main(String[] args) {

        AddData ob=new AddData();
        ob.add(5,10);
        ob.add(5.22f,5.12);
        System.out.println("Enter the numbers");
        System.out.println(ob.add(Read.sc.nextInt(),Read.sc.nextInt()));
        System.out.println("Enter the second set of numbers");
        System.out.println(ob.add(Read.sc.nextFloat(),Read.sc.nextDouble()));
    }
}
