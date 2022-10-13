import java.util.ArrayList;

public class Teacher extends Person{

    public ArrayList<String> canTeach = new ArrayList<>();
    public ArrayList<String> curretnCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach=canTeach;
    }



    @Override
    public boolean addcourse(String course) {
        if(canTeach.contains(course)){
            curretnCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
