// Assignment : Accept a sentence and display the frequency of each word
package day15;

import day2.Read;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoMap3 {

    public static void main(String[] args) {

        String name=null;
        System.out.println(" Enter the sentence ");
        name= Read.sc.nextLine();
        Map<String,Integer> map= new LinkedHashMap<>();
        for(String x : name.split("[ ,.]")){
            try{

                int n= map.get(x);
                n++;
                map.put(x,n);
            }catch(Exception e){
                map.put(x,1);
            }
        }
        System.out.println(map);
    }
}
