package labs.schooldemo;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;

    private List<Student> students = new ArrayList<>();

    private List<Teacher> teachers = new ArrayList<>();

    private List<Course> courses = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student){
        this.students.remove(student);
    }

    public void deleteStudentById(int id){
        for (Student student : this.students){
            if (student.getSchoolNumber()==id){
                this.students.remove(student);
            }
        }
    }

    public void updateStudent(Student student){

        for (Student std : this.students){                              // 4 student
            if (std.getSchoolNumber()== student.getSchoolNumber()){
                this.students.remove(std);
            }
        }
        this.students.add(student);
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                ", courses=" + courses +
                '}';
    }
}
