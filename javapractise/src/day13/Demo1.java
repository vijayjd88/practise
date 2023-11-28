package day13;
import java.io.*;
public class Demo1 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            // System.out.println("Enter two numbers");
            bw.write("Enter two numbers : ");
            bw.flush();// Periodically we have to flush
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            //System.out.println("The sum is " + (n1+n2));
            bw.write("Sum is " + (n1 + n2));
            bw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            // br.close();
        }
    }
}
