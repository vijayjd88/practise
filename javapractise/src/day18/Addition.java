package day18;

import day2.Read;

import java.io.Serializable;

public class Addition implements Serializable {
    int num1,num2,num3;

    public void readData(){
        System.out.println("Enter the two numbers ");
        this. num1= Read.sc.nextInt();
        this. num2= Read.sc.nextInt();
    }
    public void calData(){
        this.num3=this.num1+this.num2;
    }

    public void displayData(){
        System.out.println("The sum of two numbers " + this.num1 + " and "+ this.num2 + " is "+ this.num3 );
    }
}
