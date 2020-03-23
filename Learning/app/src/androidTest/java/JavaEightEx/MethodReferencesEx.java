package JavaEightEx;

import java.util.stream.Stream;

public class MethodReferencesEx {
    public static void main(String[] args) {
        Stream.of("one", "two").map(x -> x.toUpperCase());
        Stream.of("one", "two").map(String::toUpperCase);//the same above // its shorter
        Stream.of(new Student("Max"), new Student("Mike")).map(Student::getName).forEach(System.out::println);
        //Stream.of(new Student("Max"), new Student("Mike")).map(x -> x.getName() );//the same above
        //Stream.of("Dima", "Elya").map(x -> new Student(x)).forEach(x -> System.out.println(x.getName()));
        Stream.of("Dima", "Elya").map(Student::new).forEach(x -> System.out.println(x.getName()));// the same that above
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
