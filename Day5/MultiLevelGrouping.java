package Day5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<Person> people = Person.getDefaultPeople();

        Map<String, Map<Integer, List<Person>>> collect = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getGender,
                        Collectors.groupingBy(
                                p -> p.getName().length()
                        )
                ));

        System.out.println(collect);
    }
}
