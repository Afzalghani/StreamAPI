package Day5;


import java.util.List;


public class Person {
    String name;
    String gender;
    int age;
    int salary;
    DepartmentTesting department;


    Person(String name, String gender, int age, int salary,DepartmentTesting department) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary= salary;
        this.department= department;

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

    public int getSalary() {
        return salary;
    }

    public DepartmentTesting getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentTesting department) {
        this.department = department;
    }

    public static List<Person> getDefaultPeople() {
        return List.of(
                new Person("Ajay", "Male", 25, 1233,new DepartmentTesting("CS",1)),
                new Person("Afzal", "Male", 26,3400,new DepartmentTesting("Mechnical",2)),
                new Person("Tarun", "Male", 22, 1000, new DepartmentTesting("CS",1)),
                new Person("Zunaira", "Female", 25, 1000, new DepartmentTesting("Mechnical",2)),
                new Person("Varsha", "Female", 23, 2000,new DepartmentTesting("CS",1)),
                new Person("Praveen", "Male", 26, 2100, new DepartmentTesting("Arbic",1))
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
