package Day5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindLongestNamePerGender {
    public static void main(String[] args) {
        List<Person> people = Person.getDefaultPeople();

        Map<String, Optional<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getGender,
                        Collectors.maxBy(
                                Comparator.comparing(
                                        p -> p.getName().length()))
                ));


        System.out.println(collect);
    }
}
