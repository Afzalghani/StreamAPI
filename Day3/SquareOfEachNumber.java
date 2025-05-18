package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareOfEachNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(6);
        //convert of each element in the square format
        var result = listOfIntegers.stream()
                .map(i-> i*i).toList();
        result.forEach(System.out::println);

    }
}
