package School;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private Level levelOfCourse;

    public Course(Lecturer lecturer, List<Student> students, Level levelOfCourse) {
        this.lecturer = lecturer;
        this.students = students;
        this.levelOfCourse = levelOfCourse;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Level getLevelOfCourse() {
        return levelOfCourse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("lecturer=").append(lecturer);
        sb.append(", students=").append(students);
        sb.append(", levelOfCourse=").append(levelOfCourse);
        sb.append('}');
        return sb.toString();
    }
}
