import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectElementsToMap {
    public static void main(String[] args) {
        List<String> list = List.of("Maths","science","social","String");
        collectElements(list);
    }

    private static void collectElements(List<String> list) {
        Map<Integer,String> map =list.stream()
                .collect(Collectors.toMap(String::length,name->name,(x,y)->y));
        System.out.println(map);
    }
}
