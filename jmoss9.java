//julen moss
//
//
import java.util.Random;
import java.util.Scanner;

public class jmoss9 {
    public static void main(String[] args) {
        // Create random number generator
        Random rand = new Random();

        // Generate random number between 1 and 20
        int randomNumber = rand.nextInt(20) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        // Ask the user to guess a number
        System.out.println("Guess a number between 1 and 20:");

        while (true) {
            // Ensure that the input is valid (integer)
            if (!scanner.hasNextInt()) {
                // Handle incorrect entry (non-numeric input)
                System.out.println("You input an invalid number. Please enter a valid number between 1 and 20.");
                scanner.next(); // Consume the invalid input
                continue; // Re-ask the question
            }

            guess = scanner.nextInt();

            // Check if the guess is within the valid range
            if (guess < 1 || guess > 20) {
                System.out.println("You input a number that is out of range (1-20) re-enter a valid number.");
            } else if (guess < randomNumber) {
                System.out.println("You lost and your guess is lower than my number which was " + randomNumber + ". Try again:");
            } else if (guess > randomNumber) {
                System.out.println("You lost and your guess is higher than my number which was " + randomNumber + ". Try again:");
            } else {
                // If the guess is correct
                System.out.println("You won and guessed the number correctly!");
                for (int i = 0; i < guess; i++) {
                    System.out.println("You won and guessed the number correctly!");
                }
                break; // Exit the loop when the user guesses correctly
            }
        }

        scanner.close();
    }
}

