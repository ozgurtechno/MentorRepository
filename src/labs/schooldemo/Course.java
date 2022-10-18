package labs.schooldemo;

public class Course {

    public String name;
    public int minScore;

    public Course(String name, int minScore) {
        this.name = name;
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", minScore=" + minScore +
                '}';
    }
}
