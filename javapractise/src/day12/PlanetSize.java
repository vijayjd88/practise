package day12;

public enum PlanetSize {
    MERCURY("2439", "61459000"), VENUS(" 6051", "107480000"), EARTH("6371", "147630000"), MARS("3389", "229620000"), JUPITER("71492", "778000000"), SATURN("58232", "1400000000"), URANUS("25362"," 2933800000"), NEPTUNE("24622", "4472600000"), PLUTO(" 1188"," 5900000000");
    String size;
    String distance;
    PlanetSize(String x, String y){
        this.size=x;
        this.distance=y;
    }
}
