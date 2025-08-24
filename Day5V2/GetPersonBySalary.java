package Day5V2;

import Day5.Person;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GetPersonBySalary{
    public static void main(String[] args) {

        //
        var listOfPersonList= Person.getDefaultPeople();

        Map<String, Set<Integer>> listOfPeople=
                listOfPersonList.stream()
                        .collect(
                                Collectors.groupingBy(Person::getGender, TreeMap::new,
                                        mapping(Person::getSalary,toSet())));

                ;
        System.out.println("collecting the salary in set " + listOfPeople);

        //Find the Person by Gender

        Map<String,List<Person>> listOfPersonWithGender=
                listOfPersonList.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println("Person with list of gender" + listOfPersonWithGender);

       //Find the first max salry

        Person p1= listOfPersonList.stream()
                .max(Comparator.comparing(Person::getSalary)).get();
        System.out.println(p1);




    }
}
