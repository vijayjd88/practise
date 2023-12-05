package day18;

// Since we will use file handling we use the following import stmt
import java.io.*;
public class Demo1 {
    public static void main(String[] args) {

        Addition ob= new Addition();
        // Since files are used we use try and catch
        try{
            ob.readData();
            ob.calData();
            FileOutputStream fos= new FileOutputStream("Serializer1");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(ob);
            fos.close();
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("End");
        }
    }
}
