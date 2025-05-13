package Day2;

import java.util.List;

public class CountNumberOfElementInGivenCondition {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,4,5,3,2,4,5,35,3,2,4);
        var result = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(result);
    }
}
