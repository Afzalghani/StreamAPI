package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MaximumElementInList {
    public static void main(String[] args) {

        List<Integer> listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);
        listOfElements.add(4);
        listOfElements.add(5);
        listOfElements.add(6);
        listOfElements.add(null);
        //Max function has limitation, if any null value added then
        //It breaks so max sure filter the null value before going to max function
        var result = listOfElements.stream().filter(Objects::nonNull).max(Integer::compareTo);
        System.out.println(result);
    }
}
