package Day4;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUpperCase {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "java", "stream");


        List<String> upperCaseList = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase List: " + upperCaseList);

    }
}
