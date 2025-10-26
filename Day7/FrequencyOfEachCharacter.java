package Day7;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c-> (char)c) //Use Map To object convert the given character to there corresponding object
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
    }
}
