import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Maths", 90);
        map.put("Science", 80);
        map.put("English", 86);
        map.put("Social", 66);
        map.put("Computer science", 77);

        System.out.println("Before sorting: " + map);
        //sortHashMap(map);
        sortHashMapByValues(map);
    }
    public static void sortHashMapByValues(HashMap<String, Integer> map) {
        Map<String,Integer> sortedMap = 
        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1,e2) -> e1,
                LinkedHashMap :: new
                ));

            System.out.println("After sorting : "+sortedMap);
    }

    public static void sortHashMap(HashMap<String, Integer> map) {
        System.out.println("Sorting  By Key====================");
        // Sort by key
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting  By Value====================");
        // Sort by value
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
