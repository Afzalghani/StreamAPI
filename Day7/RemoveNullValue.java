package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class RemoveNullValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", null, "banana", null, "orange");
        List<Optional<String>> optionalList = list.stream()
                .map(Optional::ofNullable)
                .toList();
        optionalList.forEach(record-> System.out.println(record.orElse(null)));

        //Find the percentage of each length


        var result = list.stream().filter(c->c!=null).collect(Collectors.groupingBy(
                String::length,
                Collectors.collectingAndThen(
                        //This is a good technique and it is used to
                        //when you have two operation and need to implement the other
                        //Operation on the result you get than we use this
                        Collectors.counting(),
                        count-> ((count/ (double)list.size())* 100d)
                )
        ));
        System.out.println(result);

    }
}
