package Streams;

import java.util.List;
import java.util.stream.Collectors;

import static Streams.Gender.female;
import static Streams.Gender.male;


enum Gender{
    male, female;
}

class Person {
    public Gender gender;
    private String name;
//    private  Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}

public class _Streams {

    public static void main(String[] args) {
        List<Person> people;
        people = List.of(
                new Person("Sam", male),
                new Person("Tom", male),
                new Person("Eddie", male),
                new Person("Dan", male),
                new Person("Joan",female)

        );

        // applying stream on this list
        people.stream()
                .map(person -> person.gender) // applying map to gender
                .collect(Collectors.toSet())// this is collecting to set which helps remove duplicates
                .forEach(System.out::println);
    }
}
