package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("USA", "NY");
        map.put("Canada", "Montreal");
        map.put("UK", "London");
        map.put("Australia", "Sydney");

        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        Map<Integer, String> numbers = new LinkedHashMap<Integer, String>();
        numbers.put(1, "ONE");
        numbers.put(2, "TWO");
        numbers.put(3, "Three");
        for(Map.Entry<Integer, String> entry:numbers.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
