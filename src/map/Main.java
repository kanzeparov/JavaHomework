package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "07.12.1987");
        myHashMap.put(2, "12.10.1971");
        myHashMap.put(3, "11.01.1991");
        for(Map.Entry<Integer, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
