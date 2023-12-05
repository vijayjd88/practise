package day18;
import java.io.*;
public class Demo2DeSerialization {
    public static void main(String[] args) {
        try {
            Addition ad;
            FileInputStream fis=new FileInputStream("Serializer1");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ad=(Addition)ois.readObject();
            ad.displayData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}