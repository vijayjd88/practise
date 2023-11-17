package day4;

import day2.Read;

public class Matrix {
    Integer matrix[][];

    public Matrix(){

        matrix=new Integer[3][3];

    }

    public Matrix (int row, int col){
        matrix= new Integer[row][col];
    }


    public void readMatrix(){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(" enter"+i+" "+j);
                matrix[i][j]= Read.sc.nextInt();
            }
        }
    }
    public void displayMatrix(){
        for(int i=0; i<matrix.length;i++){ //matrix.length will give no of rows
            for(int j=0;j<matrix[i].length;j++){ //matrix[i].length will give column in that row
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println(" ");
        }
    }

    public Matrix addMatrix(Matrix b){
        Matrix c=null;
        if(this.matrix.length != b.matrix.length || this.matrix[0].length != b.matrix[0].length) {
            System.out.println( " Size of matrix is not correct. Matrix cannot be added ! ");
            return c;
        }
        Matrix d= new Matrix(this.matrix.length, this.matrix[0].length);
        for (int i=0;i<matrix.length; i++){
            for (int j=0;j<matrix[i].length; j++){
                d.matrix[i][j]=this.matrix[i][j] +b.matrix[i][j];

            }
        }
        return d;
    }
}
