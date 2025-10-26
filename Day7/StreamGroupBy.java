package Day7;

import Day5.DepartmentTesting;
import Day5.Person;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupBy {
    public static void main(String[] args) {
        List<Person> personList= Person.getDefaultPeople();

        var result = personList.stream().
        collect(Collectors.groupingBy(person -> person.getDepartment().getName(),
                Collectors.groupingBy(Person::getGender)));
        System.out.println(result);

        result.forEach((department,gendermap)->{
            System.out.println("Department: "+department);
            gendermap.forEach(
                    (gender,employeeList)->{
                        System.out.println("Gender: "+gender);
                        employeeList.forEach(System.out::println);

                    }
            );
        });

    }

}
