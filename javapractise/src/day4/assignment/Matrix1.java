package day4;
import day2.Read;
public class Matrix1 {
    Integer matrix[][];
    public Matrix1() {
        matrix = new Integer[3][3];
    }
    public Matrix1(int row, int col) {
        matrix = new Integer[row][col];
    }
    public void readMartrix(){
        for (int i = 0; i < matrix.length; i++) {  // matrix.lenth will give no of rows
            for(int j =0; j< matrix[i].length;j++){ // matrix[i].length will give column in that row
                System.out.println("enter "+i+" "+j);
                matrix[i][j] = Read.sc.nextInt();
            }
        }
    }
    public void displayMartrix(){
        for (int i = 0; i < matrix.length; i++) {  // matrix.lenth will give no of rows
            for(int j =0; j< matrix[i].length;j++){ // matrix[i].length will give column in that row
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }
}