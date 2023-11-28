package day12;

import day2.Read;

public class PlanetSizeMain {

    public static void main(String[] args) {
        PlanetSize planet;
        int c = 300000;
        System.out.println("Enter the name of the planet ");
        String pl = Read.sc.next();
        try {

            planet = PlanetSize.valueOf(pl);
            float time = (c / Integer.parseInt(planet.distance));
            System.out.println("The size of the planet is " + planet.size);
            System.out.println("The time for sunlight to reach the planet is " + time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
