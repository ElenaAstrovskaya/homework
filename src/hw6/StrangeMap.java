package hw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StrangeMap {
    public static void main(String[] args) {

        Map<Integer, String> strangeThings = new HashMap<>();
        strangeThings.put(0, "El");
        strangeThings.put(12, "Joice");
        strangeThings.put(14, "Bob");
        strangeThings.put(2, "Will");
        strangeThings.put(11, "Johnathan");
        strangeThings.put(1, "Mike");
        strangeThings.put(10, "Nancy");
        strangeThings.put(4, "Dustin");
        strangeThings.put(3, "Lucas");
        strangeThings.put(13, "Jim");
        strangeThings.put(5, "Erica");
        strangeThings.put(7, "Billy");
        strangeThings.put(6, "Max");
        strangeThings.put(9, "Robin");
        strangeThings.put(8, "Steve");

        HashSet<Integer> index = new HashSet(strangeThings.keySet());
        for(Integer i: index){
            System.out.print(i + ", ");
        }
        System.out.println();
        ArrayList<String> personages = new ArrayList(strangeThings.values());
        for(String p: personages){
            System.out.print(p + ", ");
        }
    }
}