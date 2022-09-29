public class Course {
    static private String name;

     Course(String n){
        name=n;

    }

     @Override
     public String toString(){
        return "Course: " + name;
    }

}
