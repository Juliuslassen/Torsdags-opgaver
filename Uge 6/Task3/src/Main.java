import java.awt.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Person> persons = new ArrayList<>();


    static ArrayList<String> jacksCourses = new ArrayList<String>();
    static ArrayList<String> madsensCourses = new ArrayList<>();
    static ArrayList<String> anettesCourses = new ArrayList<>();
    static ArrayList<String> gymTeacher = new ArrayList<>();


    static Student jack= new Student("Jack", jacksCourses);
    static Student klaus = new Student("Peter", jacksCourses);

    static Student madsen = new Student("Oliver", madsensCourses);
    static Student seb = new Student("Sebastian", madsensCourses);

    static Teacher jan = new Teacher("Jan", gymTeacher);
    static Teacher line = new Teacher("line", gymTeacher);
    static Teacher anette= new Teacher("Anette",anettesCourses);
    static Teacher peter = new Teacher("Peter", anettesCourses);


    public static void main(String[] args) {
        persons.add(jack);
        persons.add(klaus);
        persons.add(madsen);
        persons.add(seb);
        persons.add(jan);
        persons.add(line);
        persons.add(anette);
        persons.add(peter);

        jacksCourses.add("Java 1.0");
        jacksCourses.add("Dansk");

        madsensCourses.add("Dansk");
        madsensCourses.add("Svensk");
        madsensCourses.add("Mat c");
        madsensCourses.add("Latin");

        anettesCourses.add("Java 1.0");



        for (Person p: persons) {

            if (!p.addcourse("Java 1.0")) {

                //System.out.println(p.getName()+", this "+ p.getClass()+" does not have this course");

                if(p instanceof Student) {
                    System.out.println(p.getName() + " has already passed this course");
                } else if(p instanceof Teacher){
                    System.out.println(p.getName() + " can't teach this course");
                }
            } else {

            }
        }





    }
}