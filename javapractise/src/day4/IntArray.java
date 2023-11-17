package day4;

import day2.Read;

import java.util.Arrays;
import java.util.Collections;

public class IntArray {
    public Integer[] a;

    public IntArray() {
        System.out.println("I am in zero argument constructor ");
        a = new Integer[5];
    }
    public IntArray(int n) {
        System.out.println("i am in one argument constructor ");
        a = new Integer[n];
    }


    public void readArray() {
        for (int i = 0; i< a.length;i++) {
            System.out.println("Enter the array element "+ (i+1));
            a[i] = Read.sc.nextInt();
        }

    }
    public void displayarray() {
        for( int x : a){
            System.out.print(x + " " );
        }
        System.out.println();
    }

    public void sortArray(){
        Arrays.sort(a);
    }
    public void desendingsort(){
        Arrays.sort(a , Collections.reverseOrder());
    }

}
