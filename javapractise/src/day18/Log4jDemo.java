package day18;

import day2.Read;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jDemo {
    {
        BasicConfigurator.configure();
    }

    private static final Logger lo = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        lo.info(("I am in info level"));
        try {
            System.out.println("Enter number");
            int n = Integer.parseInt(Read.sc.nextLine());
            System.out.println(n);
        } catch (Exception e) {
            lo.error(e.getMessage());
        } finally {
            lo.info("Program ends");
        }
    }
}
