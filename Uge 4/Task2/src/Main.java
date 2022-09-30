import java.util.Scanner;

public class Main {
    String name;


    public static void main(String[] args) {
        System.out.println("Please type your name");
         Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("Please type your age");
        Scanner scanAge= new Scanner(System.in);
        int age= scanAge.nextInt();
        System.out.println("Your age is " + age);

        int retirementAge= 67;

        int yearsToRetirement=retirementAge - age;
        System.out.println("You can retire in " + yearsToRetirement + " years");

    }
}