package day6;

import day2.Read;

public class Demo2 {
    public static void main(String[] args) {
        Search obj=new Search();
        System.out.println("Enter the Array values : ");
        obj.ob.readArray();
        System.out.println("Enter the element to search : ");
        int k= Read.sc.nextInt();
        int x=obj.binarySearch(k);
        if(x==-1) System.out.println("Element not found ");
        else System.out.println("Element found at : "+x);
        /*
        Assignment :
        1. Accept 10 names and sort in alphabetical order using selection sort
        2. Write a linear search to
         */
    }
}
