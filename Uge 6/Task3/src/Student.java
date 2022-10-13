import java.util.ArrayList;

public class Student extends Person{

    public ArrayList<String> passedCourses = new ArrayList<>();
    public ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
    super(name);
    this.passedCourses=passedCourses;
    }

    @Override
    public boolean addcourse(String course) {
        if(passedCourses.contains(course)){
            //System.out.println("This course has already been passed");
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}
