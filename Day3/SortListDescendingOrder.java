package Day3;

import java.util.ArrayList;
import java.util.List;

public class SortListDescendingOrder {
    public static void main(String[] args) {
        List<Integer> listOfNumber  = new ArrayList<>();
        listOfNumber.add(1);
        listOfNumber.add(2);
        listOfNumber.add(3);
        listOfNumber.add(4);

        listOfNumber.stream().sorted((o1,o2)-> o2-o1)
                .forEach(System.out::println);

    }
}
