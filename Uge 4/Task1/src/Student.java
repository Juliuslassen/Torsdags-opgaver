import java.util.ArrayList;

public class Student {

    static private String name;
    static private ArrayList<Course> courses= new ArrayList<Course>();

    Student(String n){
        name=n;
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    @Override
    public String toString(){
        return "Student: " + name + ", is in " + courses;
    }
}
