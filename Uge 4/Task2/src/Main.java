import java.util.Scanner;

public class Main {
    String name;
    int age;
    static int result;
    public static void main(String[] args) {
        System.out.println("Please type your name");
         Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("Please type your age");
        Scanner scanAge= new Scanner(System.in);
        String age= scanAge.nextLine();
        System.out.println("Your age is " + age);

        int a= 67;
        // virker jo ikke det pis
        result=a-age;
        System.out.println(result);

    }
}