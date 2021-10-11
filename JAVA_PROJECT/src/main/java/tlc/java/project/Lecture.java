package JAVA_PROJECT.src.main.java.tlc.java.project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private Students students;
    private List<Double> ListOfStudents = new ArrayList<>();




    public void enter(Students students){

    }

    public void setListOfStudents(List<Double> listOfStudents) {
        ListOfStudents = listOfStudents;

    }

    public List<Double> getListOfStudents() {
        ListOfStudents.add(students.getAverageGrade());
        return ListOfStudents;
    }
}
