package Day5V2;

import Day5.Person;

public class FindPerSecondLargestSalary {
    public static void main(String[] args) {
        var personList= Person.getDefaultPeople();
        System.out.println(personList);

        var person= personList.
                stream().sorted((p1,p2)-> p2.getSalary()-p1.getSalary())
                .skip(1).findFirst();
        System.out.println(person.get().getSalary());
    }
}
