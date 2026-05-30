import java.util.ArrayList;
import java.util.Scanner;

public class timepass1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        while (true) {
            System.out.print("Enter a fruit (or type stop): ");
            String fruit = sc.nextLine();

            if (fruit.equalsIgnoreCase("stop")) {
                break;     
            }
                                                                                                    
            fruits.add(fruit);
        }

        System.out.println("\nElements in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        sc.close();
    }
}