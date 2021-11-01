package School;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // creating a list of students from different levels
        List<Student> listOfStudents = List.of(
                new Student("Sam Laryea", "Q001", Level.firstYear),
                new Student("James Otu", "Q002", Level.firstYear),
                new Student("Anani Otu", "Q003", Level.secondYear),
                new Student("Joseph Gar", "Q004", Level.secondYear),
                new Student("Mary Ghab", "Q005", Level.thirdYear),
                new Student("Gloria Bansah", "Q006", Level.thirdYear),
                new Student("Gina Gaa", "Q007", Level.forthYear),
                new Student("Chris Baahh", "Q008", Level.forthYear)
        );

        // getting the list of students for the intro to programming course
        List<Student> programmingStudents = new ArrayList<>();
        for(Student s : listOfStudents){

            if (s.getLevel() == Level.firstYear){
                programmingStudents.add(s);
            }
        }

        // creating an instance of a course
        Lecturer lecturer = new Lecturer("Sam Moorhouse", CourseName.Programming);
        Course IntroToProgramming = new Course(lecturer,programmingStudents,Level.firstYear);

        // another instanse of course
        List<Student> gardeningStudents = new ArrayList<>();
        for(Student s1 : listOfStudents){

            if ( s1.getLevel() == Level.thirdYear){
                gardeningStudents.add(s1);
            }
        }

        Course AdvanceGardening = new Course(lecturer,gardeningStudents,Level.thirdYear);

        System.out.println(IntroToProgramming);
        System.out.println(AdvanceGardening);
    }
}
