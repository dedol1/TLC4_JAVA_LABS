package School;

public class Student {

    private String name;
    private String ID;
    private Level level;

    public Student(String name, String ID, Level level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", ID='").append(ID).append('\'');
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
