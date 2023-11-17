package day5;

import day2.Read;

public class SelectionSort {

    int a = 0;
    int b = 0;
    int temp = 0;
    String tempstr=null;
    int[] arr = new int[5];

    public void readData() {
        System.out.println(" Enter the number of elements to sort : ");
        int n = Read.sc.nextInt();
        // int array[]=new array[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1));
            arr[i] = Read.sc.nextInt();
        }

    }

    public int[] SelSort() {

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(" Value of 1st Loop " +i);
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println(" Value of inner Loop " +arr[j]);
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public String[] SelNameSort(String[] name) {

        for (int i = 0; i < name.length; i++) {

            for (int j = i+1; j < name.length; j++) {

                if (name[i].compareToIgnoreCase(name[j]) > 0) {
                    tempstr = name[j];
                    name[j] = name[i];
                    name[i] = tempstr;
                }
            }
        }
        return name;
    }
}
