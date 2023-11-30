package day15;
import java.time.LocalDate;
import java.util.*;
import day10.Student;
import day2.Read;

public class MapDemo2 {
    public static void main(String[] args) throws Exception{
        // Using Student data from day10
        Map<String, Student> map=new HashMap<>();
        int ch=0;
        try {
            do {
                System.out.println(" 0- Exit, 1- Add , 2-Display 3-Display All 4- Remove All  ");
                ch = Integer.parseInt(Read.sc.nextLine()); // because 'nextLine' returns String, that has to be type casted to integer
                switch (ch) {
                    case 0:
                        System.out.println(" Your application is closed");
                        break;
                    case 1:
                        System.out.println(" Enter student details : Name, City, DOB");
                        Student ob = new Student();
                        ob.setFname(Read.sc.nextLine());
                        ob.setCity(Read.sc.nextLine());
                        ob.setDob(LocalDate.parse(Read.sc.nextLine()));
                        map.put(ob.getFname(), ob);
                        break;
                    case 2:
                        System.out.println(" Enter the name to display ");
                        System.out.println(map.get(Read.sc.nextLine()));
                        break;
                    case 3:
                        map.keySet().forEach((x) -> {
                            System.out.println(map.get(x));
                        });
                        break;
                    case 4:
                        System.out.println("Enter the name to Remove");
                        map.remove(Read.sc.nextLine());
                        System.out.println(" Removed ");
                        break;
                    default:
                        System.out.println(" Invalid choice");
                        break;
                }
            } while (ch != 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

