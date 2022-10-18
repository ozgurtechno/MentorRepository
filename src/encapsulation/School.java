package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Course> courses = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }




}
