// Map Operations
import java.util.*;

public class timepass5 {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(null, "H");
        map.put(null, "I");


        map.forEach((key,value) -> System.out.println(key + " " + value));
    }
}
