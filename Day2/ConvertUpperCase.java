package Day2;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        var result= s.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toUpperCase)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
