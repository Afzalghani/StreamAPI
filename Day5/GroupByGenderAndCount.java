package Day5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGenderAndCount {
    public static void main(String[] args) {
        List<Person> people = Person.getDefaultPeople();

        Map<String, Long> collect = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getGender,
                        Collectors.counting()));

        System.out.println(collect);
    }
}
