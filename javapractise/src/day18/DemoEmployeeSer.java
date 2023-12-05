package day18;

import java.io.*;
public class DemoEmployeeSer {
    public static void main(String[] args) {

      Employee emp= new Employee();

        try {
            emp.readData();
            emp.calData();
            FileOutputStream fos = new FileOutputStream("Serialization3");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}