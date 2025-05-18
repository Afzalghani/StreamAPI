package Day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStringAlphabatically {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Joe");
        listOfNames.add("Jack");
        listOfNames.add("Aane");
        listOfNames.add("Bob");
        listOfNames.add("Cop");

        //It is important to pass the comparator when you have custom sorting or sorting based
        //On the multiple parameter
        listOfNames.stream().sorted((o1, o2) -> o1.charAt(1) - o2.charAt(1)==0?o1.charAt(0) - o2.charAt(0)
                :o1.charAt(1) - o2.charAt(1)).forEach(System.out::println);


    }
}
