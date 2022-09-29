import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Read user input
        String input = scan.nextLine();

        //use hasNextInt to check if input is numeric,
        //   Compare it with the random number
        while (scan.hasNextInt()) {

            System.out.println("Guess a number");

            if (rnd_number == scan.nextInt()) {
                System.out.println("Your guess is correct");


            } else if (rnd_number < scan.nextInt()) {
                System.out.println("Your guess is too high");


            } else if (rnd_number > scan.nextInt()) {
                System.out.println("Your guess is too low");


            }
            System.out.println("The number was " + rnd_number);
            break;
        }
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the rigth number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
    }
}
