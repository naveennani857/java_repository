import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String str = "Naveen";
        findDuplicates(str);
    }

    private static void findDuplicates(String str) {
        //str.chars().forEach(System.out::println); converts String to IntStream
        //Map<Character,Long> map =
               List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue()>1)
                        .map(x ->x.getKey())
                        .toList();

        System.out.println(list);
//        map.entrySet().stream()
//                .filter(entry -> entry.getValue()>1)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);
    }
}
