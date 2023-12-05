package day18;

import day2.Read;

public class DemoInternationalization {
    public static void main(String[] args) {
        try{
            int n1,n2,n3;
            System.out.println(ResourceGetKey.getKey("ken1"));
            n1= Integer.parseInt(Read.sc.nextLine());
            System.out.println(ResourceGetKey.getKey("ken1"));
            n2= Integer.parseInt(Read.sc.nextLine());
            n3=(n1+n2);
            System.out.println(ResourceGetKey.getKey("sumOf") + " " +n3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("End");
        }
    }
}
