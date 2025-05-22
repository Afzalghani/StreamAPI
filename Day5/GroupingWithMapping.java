package Day5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWithMapping {
    public static void main(String[] args) {
        List<Person> people = Person.getDefaultPeople();

        Map<String, List<String>> collect = people.stream()
                        .collect(Collectors.groupingBy(
                                Person::getGender,
                                Collectors.mapping(Person::getName, Collectors.toList())
                        ));

        System.out.println(collect);
    }
}
