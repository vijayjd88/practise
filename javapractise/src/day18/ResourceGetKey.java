package day18;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceGetKey {


    public static String getKey(String key){
        Locale.setDefault(Locale.US);
        ResourceBundle rs= ResourceBundle.getBundle("Int");
        return rs.getString(key);
    }
}
