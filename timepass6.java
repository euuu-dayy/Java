import java.util.*;

public class timepass6 {
    public static void main(String[] args) {
        String str = "Hello";

        //str.length();               // Length
        //str.charAt(0);              // Character at index

        for( int i=0 ; i<str.length() ; i++){
            System.out.print((str.charAt(i)));
        }

        System.out.println();

        // str.substring(1);           // From index 1 to end
        // str.substring(1,4);         // Index 1 to 3

        // str.toUpperCase();          // HELLO
        // str.toLowerCase();          // hello

        // str.equals("Hello");        // Compare content
        // str.equalsIgnoreCase("hello");

        // str.indexOf('l');           // 2
        // str.lastIndexOf('l');       // 3

        //CRITICS 
        str.contains("ell");        // true
        str.replace('l','x');       // Hexxo
        str.trim();                 // Remove spaces
        str.isEmpty();              // Check empty
        str.concat(" World");       // Append
        str.split(" ");             // Split into array
        str.toCharArray();          // Convert to char[]

        //Reverse string using StringBuilder (Preffered)
        String string = "madammm";

        String newString = new StringBuilder(string).reverse().toString();

        System.out.println(newString);

        //StringBuilder Operations

        //AI-DR-DC-RR-TCS-CL
        //append , insert, delete , deleteCharAt , replace , reverse , toString , charAt , setCharAt , capacity , length

        sb.append(" World");        // Add at end

        sb.insert(2,"ABC");         // Insert

        sb.delete(1,4);             // Delete range

        sb.deleteCharAt(2);         // Delete one char

        sb.replace(0,2,"Hi");       // Replace

        sb.reverse();               // Reverse

        sb.toString();              // Convert to String

        sb.charAt(1);               // Character

        sb.setCharAt(0,'X');        // Update char

        sb.capacity();              // Capacity

        sb.length();                // Length

        //By default capacity of StringBuilder is 16 
        //when the capacity is exceeded then the 
        // new_capacity = old_capacity * 2 + 2

    }


}
