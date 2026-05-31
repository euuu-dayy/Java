// Set Operations

import java.util.*;

public class timepass4 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);
        set.add(50);
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(100);

        System.out.print(set);
        System.out.println();

        //Replace 100 with 200
        for(Integer num : set){
            if(num == 100){
                set.remove(num);
                set.add(200);
            }
        }

        System.out.print(set);
        System.out.println();

        //Syntax
        set.forEach(System.out::print);
        System.out.println();

        //Syntax
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        
        
    }
}
