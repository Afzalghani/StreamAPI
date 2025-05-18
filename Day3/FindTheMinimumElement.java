package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindTheMinimumElement {
    public static void main(String[] args) {
        List<Integer> listOfNumbers= new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(6);

        //Object::nonNull is a method which is used
        //Filter the null values from the list
        //It is important to understand that list should have non null values
        var result = listOfNumbers.stream()
                .filter(Objects::nonNull)
                .min(Integer::compareTo);
        System.out.println(result);
    }
}
