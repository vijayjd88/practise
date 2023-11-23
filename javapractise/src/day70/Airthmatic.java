package day70;

import day2.Read;

public   abstract class Airthmatic implements IAirthmatic{
    int num1;
    int num2;
    int num3;

    public void readData(){
        System.out.println("enter two number");
        this.num1 = Read.sc.nextInt();
        this.num2 = Read.sc.nextInt();
    }
    public void display(){
        System.out.println("Num1 = " + this.num1 + " Num2 = " + this.num2 + " Num3 = " + this.num3);
    }


}
