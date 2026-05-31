import java.util.*;

public class timepaas0 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");

        List<String> list = new ArrayList<>(map.values()); // [Apple, Banana, Cherry]
        
        System.out.println(list);

        for (String s : list){
            System.out.print(s);  // AppleBananaCherry
        }
        System.out.println();

        StringBuilder sb = new StringBuilder();
        for (String s : list){
            sb.append(s + ", ");
        }

        System.out.println(sb.toString()); // Apple, Banana, Cherry

        List<Integer> list2 = new ArrayList<>(map.keySet());

        System.out.println(list2); // [1, 2, 3]

    }
}
