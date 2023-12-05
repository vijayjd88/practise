package day17Streams;

public class Demo3Streams {
    public static void main(String[] args) {
        String s1 = " True glory is- doing our duty with all our heart";
        String [] s2=  s1.split("[ ,-]");
        for (String x:s2
             ) {
            System.out.println(x);
        }
    }
}
