//List Operations

import java.util.*;

public class timepass2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(70);
        list.add(80);

        System.out.println(list);

        System.out.println();

        //2 , //3
        for(int i = 0 ; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        //4 Problem Statement - replace 70 with 1000
        for(int i=0 ; i<list.size(); i++){
            if(list.get(i) == 70){
                list.set(i,1000);
            }
        }

        System.out.println(list);
        
        //5 
        list.remove(0);
        System.out.println(list);

        if(list.contains(1000)){
            System.out.println("Jai Mata Di");
        }

        //6
        list.clear();
        System.out.println(list);

        if(list.isEmpty()){
            System.out.println("Jai Mata Di");
        }



        
    }
}