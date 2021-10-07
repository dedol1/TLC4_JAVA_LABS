package imparative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imparative.Gender.female;
import static imparative.Gender.male;

// declaring an enum for our gender note: this enum acts as a type to the gender variable
enum Gender{
    male, female;
}

class Person{
    public Gender gender;
    private  String name;
//    private  Gender gender;

    Person(String name , Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
public class ImpatativeProgramming {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Sam", male),
                new Person("Tom", male),
                new Person("Eddie", male),
                new Person("Dan", male),
                new Person("Joan",female)
        );

        // using imperative approach to fetch all males in the list of people

        System.out.println(" this output is for the imperative approach");
        List<Person> males = new ArrayList<>();

        for (Person person: people){
            if (male.equals(person.gender)){
                males.add(person);
            }
        }

        for ( Person male: males){
            System.out.println(male);
        }

        System.out.println(" this output is for the declarative approach");
        // using declarative means
        people.stream().filter(person -> male.equals(person.gender))
                .forEach(System.out::println);
    }
}
