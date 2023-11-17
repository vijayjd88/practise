package day6;

import day2.Read;

public class Demo1 {

    public static void main(String[] args) {

        Search sobj = new Search();
        sobj.ob.readArray();
        sobj.ob.displayarray();
        System.out.println("Enter element to search : ");
        int key = Read.sc.nextInt();
        int x = sobj.LinearSearch(key);
        if (x == -1) System.out.println("Element not found...");
        else System.out.println(" Element found in index " + x);
        int[] arr = sobj.LinearSearchDup(key);
        if (arr == null) System.out.println("Element not found ");
        else {
            int flag = -1;
            for (int y : arr) {
                if ((flag > -1 && y != 0) || (flag == -1)) {
                    System.out.println("Element found at index : " + y);

                }
                flag++;
            }
        }
    }
}
