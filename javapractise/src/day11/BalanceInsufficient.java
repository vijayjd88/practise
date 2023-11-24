package day11;

public class BalanceInsufficient  extends Exception{

    public BalanceInsufficient() {
        super("No Sufficiant banlnce your transaction is cancelled");

    }
    public BalanceInsufficient(String x) {
        super(x);

    }
}
