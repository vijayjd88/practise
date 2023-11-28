package day12;

public enum Planets {
    SUNDAY("Sun", "Yellow-Red"),MONDAY("Moon","White"),TUESDAY("Mars", "Red"),WEDNESDAY("Mercury","Green"),THURSDAY("Jupiter","Yellow"),FRIDAY("Venus","White"),SATURDAY("Saturn", "Blue ");
    String owner;
    String colour;
    Planets(String x, String y){
        this.owner=x;
        this.colour=y;
    }
}
