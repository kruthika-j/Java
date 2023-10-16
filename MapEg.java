import java.util.HashMap;
import java.util.Map;

public class MapEg {
    public static void main(String[] args) {
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("USA", 331);
        populationMap.put("China", 1441);
        populationMap.put("India", 1393);

        System.out.println("Population of China: " + populationMap.get("China"));

        System.out.println("Is India in the map? " + populationMap.containsKey("India"));

        System.out.println("Entries in the map:");
        for (Map.Entry<String, Integer> enry : populationMap.entrySet()) {
            System.out.println(enry.getKey() + ": " + enry.getValue());
        }
    }
}
