package ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseListHashMap {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("NY");
        cityOfUSA.add("NJ");
        cityOfUSA.add("PA");
        cityOfUSA.add("CO");
        cityOfUSA.add("FL");

        List<String> cityOfCanada = new ArrayList<String>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Manitova");
        cityOfCanada.add("Alberta");

        List<String> cityOfAustralia = new ArrayList<String>();
        cityOfAustralia.add("Sydney");
        cityOfAustralia.add("Quinsland");
        cityOfAustralia.add("Canbera");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", cityOfUSA);
        map.put("Canada", cityOfCanada);
        map.put("Australia", cityOfAustralia);

        for(Map.Entry<String, List<String>> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
