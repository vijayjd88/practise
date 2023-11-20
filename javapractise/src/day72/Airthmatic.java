package day72;

import day2.Read;

public class Airthmatic {
   AddData data = new AddData();

    public void readData(){
        System.out.println("enter two number");
       data.setNum1(Read.sc.nextInt());
        data.setNum2(Read.sc.nextInt());
    }
    public void display(){
        System.out.println("Num1 = " + data.getNum1() + " Num2 = " + data.getNum2() + " Num3 = " + data.getNum3());
    }

}
