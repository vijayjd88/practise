package day11;
public class InvalidDateEntry extends Exception {
    public InvalidDateEntry() {
        super("Invalid date ");
    }
    public InvalidDateEntry(String x) {
        super(x);
    }
}
