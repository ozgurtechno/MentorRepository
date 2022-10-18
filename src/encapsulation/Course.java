package encapsulation;

public class Course {

    private String name;
    private int minScore;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int minScore) {
        this.name = name;
        this.setMinScore(minScore);
    }

    public void setMinScore(int minScore) {
        if (minScore < 50){
            return;
        }
        this.minScore = minScore;
    }
}
