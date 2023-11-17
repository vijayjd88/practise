package day5;

import day2.Read;
import java.lang.*;

/*
Note : Inside the class, outside the method only declaration can be done. Execution statements should not be written.
All execution statements should be compulsorily in the method.
 */

public class PrimeRange {
    int rg1,rg2;

    public void readData() {
        System.out.println(" Enter the lower limit of range : ");
        this.rg1 = Read.sc.nextInt();
        System.out.println(" Enter the upper limit of range : ");
        this.rg2 = Read.sc.nextInt();
    }
    public int[] returnPrime() {
        int a[]=new int[20];
        int count=0;
        for (int i=rg1; i<=rg2;i++){
            if (isPrime(i)){
                a[count]=i;
                count++;
            }
        }
        return a;
    }
    public boolean isPrime(int a){
        int odd = 3;
        boolean flag = false;

        if (a == 2) {
            return true;
        }

        if(a%2==0){
            return false;
        }
            for (int i = 3; i <= Math.sqrt(a); i+=2) {

                if (a % i == 0) {
                    flag = false;
                    return flag;
                }
            }
        return flag;
    }
}
