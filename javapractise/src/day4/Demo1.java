package day4;

import day2.Read;

public class Demo1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter No " + (i+1));
            a[i] = Read.sc.nextInt();
        }
        //Display the contents of the array vertically
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // Display the contents of the array horizontally
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //display the contents of the array using for each loop
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
