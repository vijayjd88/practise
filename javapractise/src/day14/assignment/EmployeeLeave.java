package day14.assignment;

import day10.Student;
import day2.Read;

import java.time.LocalDate;
import java.util.*;

public class EmployeeLeave {

    public static final Integer MAX_LEAVES=25;
    public static void main(String[] args) {


        //Queue<Object> q1=new LinkedList<>();
        Map<String, Employee> map = new LinkedHashMap<>();
        List<Employee> leavegranted= new LinkedList<>();
        Employee ob = new Employee();
        int ch=0;
        int count=0;

        try {
            do {
                System.out.println(" 0- Exit, 1- Add, 2- Apply for leave 3- Display Leave Status 4 - Remove Leave Requests and start afresh for a new day");
                ch = Integer.parseInt(Read.sc.nextLine()); // because 'nextLine' returns String, that has to be type casted to integer
                switch (ch) {
                    case 0:
                        System.out.println(" Your application is closed");
                        break;
                    case 1:
                        System.out.println(" Enter Employee details : Name, Leave Availed, Leave Requested");

                        ob.setname(Read.sc.nextLine());
                        ob.setLve_availed(Integer.valueOf(Read.sc.nextLine()));
                        ob.setLve_request(Integer.valueOf(Read.sc.nextLine()));
                        map.put(ob.getname(), ob);
                        break;
                    case 2:

                      //  map.keySet().forEach((x)->{
                            //System.out.println(map.get(x));

                            for(Map.Entry<String , Employee> ent : map.entrySet()){
                                Employee e = new Employee();
                                if((map.get(ent.getKey()).lve_availed+map.get(ent.getKey()).lve_request) < MAX_LEAVES){
                                    e.setname(ent.getKey());
                                    e.setLve_availed(map.get(ent.getKey()).lve_availed);
                                    e.setLve_request(map.get(ent.getKey()).lve_request);
                                    leavegranted.add(e);
                                    System.out.println( "Mr." + ent.getKey()+" you are eligible for leave ,   Leave Availed : "+map.get(ent.getKey()).lve_availed+" Leave Requested : "+ map.get(ent.getKey()).lve_request);
                                }else{
                                    System.out.println( "Mr." + ent.getKey()+"  You not eligible for leave, please report to Drill Square : "+map.get(ent.getKey()).lve_availed+" Leave Requested : "+ map.get(ent.getKey()).lve_request);
                                }

                            }
                           /* if((ob.getLve_availed()+ob.getLve_request())<MAX_LEAVES){
                                leavegranted.add(map.get(x));
                            }*/
                     //   });

                        break;
                    case 3:
                        System.out.println("Leave granted to :  " + leavegranted);
                       // map.keySet().forEach((x) -> {
                         //   System.out.println(map.get(x));
                      //  });
                        System.out.println(leavegranted);
                        break;
                    case 4:
                        map.keySet().forEach((x)->{
                            map.remove(x);
                        });
                        System.out.println(" THANK YOU FOR USING THE LEAVE MANAGEMENT SYSTEM");
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
