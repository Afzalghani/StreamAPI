package Day7;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveTheSpecialCharacter {
    public static boolean filter(Character ch){
        return (ch>'a' && ch < 'z') || (ch>'A' && ch<'Z');
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String removedString = s.chars().mapToObj(c -> (char)c)
                .filter(RemoveTheSpecialCharacter::filter)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(removedString
        );

    }
}
