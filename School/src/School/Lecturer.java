package School;

public class Lecturer {
    private String name;
    private CourseName nameOfCOurse;

    public Lecturer(String name, CourseName nameOfCOurse) {
        this.name = name;
        this.nameOfCOurse = nameOfCOurse;
    }

    public String getName() {
        return name;
    }

    public CourseName getNameOfCOurse() {
        return nameOfCOurse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lecturer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nameOfCOurse=").append(nameOfCOurse);
        sb.append('}');
        return sb.toString();
    }
}
