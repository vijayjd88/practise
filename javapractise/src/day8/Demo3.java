package day8;

import day2.Read;

public class Demo3 {
    public static void main(String[] args) {
        OverloadAdd ob = new OverloadAdd();
        System.out.println(ob.add(10,10));
        System.out.println(ob.add(10.2f,10.0f));
        System.out.println("enter values ");
        int a= Read.sc.nextInt();
        int b = Read.sc.nextInt();
        System.out.println(ob.add(a,b));
        float a1= Read.sc.nextFloat();
        float  b1 = Read.sc.nextFloat();
        System.out.println(ob.add(a1,b1));
    }

}
