package Day5V2;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Afzal Ghani";
        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

        System.out.println(reversed);
    }
}
