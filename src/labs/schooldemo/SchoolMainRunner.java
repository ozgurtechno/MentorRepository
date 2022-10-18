package labs.schooldemo;

public class SchoolMainRunner {

    public static void main(String[] args) {

        School school = new School("ODTU");
        Student student1 = new Student("Ahmet", "Y", 12334, 4);

        school.addStudent(student1);
        school.addStudent(new Student("Ahmet", "M", 12338, 4));

        System.out.println(school.getStudents());
        school.updateStudent(new Student("Veli", "Y", 12334, 4));

        System.out.println(school.getStudents());

        Course course1 = new Course("English", 65);
        Course course2 = new Course("English", 65);
        Course course3 = new Course("English", 65);
        Course course4 = new Course("English", 65);

        Teacher teacher1 = new Teacher("Veli");
        Teacher teacher2 = new Teacher("Veli");
        Teacher teacher3 = new Teacher("Veli");

        //-----------------------------------------------------




    }
}
