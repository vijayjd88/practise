package day12;

import day2.Read;

public class PlanetsDemo {

    public static void main(String[] args) {
        Planets planet;
        System.out.println("Enter planet name");
        String pl= Read.sc.next().toUpperCase();//nextint, nextfloat etc can be used with next.However nextLine cannot be used with next,nextint,nextfloat
        try{
            planet= Planets.valueOf(pl);// valueof converts string to const
            System.out.println("Owner is " +planet.owner);
            System.out.println("Colour is " +planet.colour);
            System.out.println("--------------------------");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
