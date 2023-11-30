package day15;
import java.util.*;
public class MapDemo1 {

    static Map<String,Integer> map= new TreeMap<>();// City is the key and Population is the value
    public static void main(String[] args) {

        map.put("Delhi", 3300000);
        map.put("Delhi", 330000);
        map.put("Chennai", 3100000);
        map.put("Bangalore", 2900000);
        map.put("Mumbai", 4300000);
        map.put("Calcutta", 4000000);

        System.out.println(map);
        System.out.println("-----Disp map using foreach loop------");
        for(String key : map.keySet()){
            System.out.println(key+ " : "+map.get(key) );

        }
        System.out.println("--------Disp Map using foreach------");
        map.keySet().forEach(System.out::println);
        map.keySet().forEach((x)->{
            System.out.println(x + " : "+map.get(x) );

        });
        System.out.println(" Display using method reference  "); // This is not recommended
        map.keySet().forEach(MapDemo1::f1);

        // To remove an element from the map
        map.remove("Delhi");
        System.out.println(map);
        map.clear(); // to remove everything
        System.out.println(map);

    }
    public static void f1(String k){
        System.out.println(k+ " : " +map.get(k));
    }
}
