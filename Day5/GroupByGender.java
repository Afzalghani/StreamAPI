package Day5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    public static void main(String[] args) {

        List<Person> people = Person.getDefaultPeople();

        Map<String, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(collect);
    }
}
