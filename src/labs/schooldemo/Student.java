package labs.schooldemo;

public class Student extends Person{
    private int schoolNumber;
    private int grade;

    public Student(String firstName, String lastName, int schoolNumber, int grade) {
        super(firstName, lastName);
        this.schoolNumber = schoolNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolNumber=" + schoolNumber +
                ", grade=" + grade +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }


}
