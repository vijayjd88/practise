package day6;
import day4.IntArray;

public class Search {

    public IntArray ob= new IntArray();

    public int LinearSearch(int key){
        for(int i=0; i<ob.a.length;i++){

            if(ob.a[i]==key) return i;
        }
        return -1;
    }

    public int[] LinearSearchDup(int key){
        int[] arr=new int[5];
        int flag=-1;
        for(int i=0; i<ob.a.length;i++){

            if(ob.a[i]==key) {
                arr[++flag]=i;

            }
        }
        if(flag==-1){
            return null;
        }
        else return arr;

    }

    public int binarySearch(int k){
        ob.sortArray();
        int lb=0;
        int hb=ob.a.length-1;
        int mb=0;
        while(true){
            if(lb>hb)break;
            mb=(lb+hb)/2;
            if(ob.a[mb]==k) return mb;
            if(ob.a[mb]>k) hb=mb-1;
            if(ob.a[mb]<k) lb=mb+1;
        }
        return -1;
    }

}
