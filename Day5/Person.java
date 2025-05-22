package Day5;


import java.util.List;

public class Person {
    String name;
    String gender;
    int age;

    Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static List<Person> getDefaultPeople() {
        return List.of(
                new Person("Ajay", "Male", 25),
                new Person("Afzal", "Male", 26),
                new Person("Tarun", "Male", 22),
                new Person("Zunaira", "Female", 25),
                new Person("Varsha", "Female", 23),
                new Person("Praveen", "Male", 26)
        );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
