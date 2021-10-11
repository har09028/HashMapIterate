package rev;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        HashMap<Integer, String> newMap = createHashMap();
        System.out.println("\nWhile loop iteration:");
        whileLoopIterate(newMap);
        System.out.println("\nAdvanced For loop iteration:");
        forLoopIterate(newMap);

    }

    public static HashMap<Integer, String> createHashMap() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> newMap = new HashMap<Integer, String>();

        System.out.println("Enter the number of elements in the HashMap (cannot be 0 or negative):");
        int numElements = sc.nextInt();
        while (numElements <= 0) {
            System.out.println("Cannot be 0 or negative! Try again:");
            numElements = sc.nextInt();
        }
        System.out.println("Enter text to add to HashMap:");
        for (int i = 1; i <= numElements; i++) {
            String entry = sc.next();
            newMap.put(i, entry);
        }

        return newMap;
    }

    public static void whileLoopIterate(HashMap<Integer, String> currentMap) {
        Iterator<Map.Entry<Integer, String>> iterator = currentMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer,String> newMap = iterator.next();
            System.out.println("Key: " + newMap.getKey() + " Value: " + newMap.getValue());
        }
    }

    public static void forLoopIterate(HashMap<Integer, String> currentMap) {

        for (Map.Entry<Integer, String> newMap : currentMap.entrySet()) {
            System.out.println("Key: " + newMap.getKey() + " Value: " + newMap.getValue());
        }
    }

}
