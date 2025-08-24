package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamGroupBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
        Map<Integer, Long> countByNameLength = names
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));// Group the element based on the length and count the String that match with the length

        System.out.println(countByNameLength);

        List<String> list = Arrays.asList("apple", null, "banana", null, "orange");
        List<Optional<String>> optionalList = list.stream()
                .map(Optional::ofNullable)
                .collect(Collectors.toList());

        System.out.println(optionalList);


    }

}
