package Day5V2;

import Day5.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetPersonBySalary{
    public static void main(String[] args) {

        //
        var listOfPersonList= Person.getDefaultPeople();

        Map<Integer, List<Person>> listOfPeople=
                listOfPersonList.stream()
                        .collect(
                                Collectors.groupingBy(Person::getSalary));
                ;
        System.out.println(listOfPeople);

       //Find the first max salry

        Person p1= listOfPersonList.stream()
                .max(Comparator.comparing(Person::getSalary)).get();
        System.out.println(p1);
    }
}
