package day5;

import day4.Matrix;

public class Demo1 {
    public static void main(String[] args) {

        Matrix a=new Matrix(3,2);
        Matrix b= new Matrix(3,2);
        a.readMatrix();
        b.readMatrix();
        a.displayMatrix();
        System.out.println(" -------B Matrix  ");
        b.displayMatrix();
        System.out.println(" -------C Matrix  ");
        Matrix c=a.addMatrix(b);
        if(c!=null) c.displayMatrix();
    }
}
