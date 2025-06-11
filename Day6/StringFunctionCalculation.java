package Day6;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFunctionCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();
        Map<Character, Long> frequencyMap = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        System.out.println(frequencyMap);

    }
}
