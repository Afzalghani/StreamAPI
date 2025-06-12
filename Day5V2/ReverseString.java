package Day5V2;

import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Afzal Ghani";
        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

        System.out.println(reversed);

        //Easy way to reverse a string
        //This is another way to reverse the string
        String reverseString = Stream.of(str.split(""))
                .reduce("",(reverseSoFar, current)->current+reverseSoFar);
        System.out.println(reverseString);

    }
}
