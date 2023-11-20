package day72;

import day2.Read;

public class Demo2 {
    public static void main(String[] args) {
        AddData dt = new AddData();
        System.out.println("enter two");
        dt.setNum1(Read.sc.nextInt());
        dt.setNum2(Read.sc.nextInt());
        System.out.println(dt.getNum1() + dt.getNum2());
    }
}
