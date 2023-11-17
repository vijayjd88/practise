package day6.Assignment;

import day2.Read;
import day5.SelectionSort;

public class NameSort {
    public static void main(String[] args) {

        String []names=new String[10];
        System.out.println("Enter 10 names : ");
        for(int i=0;i<10;i++){
            names[i]= Read.sc.next();
        }
        SelectionSort ob=new SelectionSort();
        String [] sortedname= new String[10];
        sortedname=ob.SelNameSort(names);
        for(String x : names){
            System.out.println(x);
        }

    }
}
