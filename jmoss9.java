//julen moss
//
//
import java.util.Random;
import java.util.Scanner;

public class jmoss9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 20:");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("You input an invalid number. Please enter a valid number between 1 and 20.");
                scanner.next(); 
                continue;
            }

            guess = scanner.nextInt();
            
            if (guess < 1 || guess > 20) {
                System.out.println("You input a number that is out of range (1-20) re-enter a valid number.");
            } else if (guess < randomNumber) {
                System.out.println("You lost and your guess is lower than my number which was " + randomNumber + ". Try again:");
            } else if (guess > randomNumber) {
                System.out.println("You lost and your guess is higher than my number which was " + randomNumber + ". Try again:");
            } else {
                System.out.println("You won and guessed the number correctly!");
                for (int i = 0; i < guess; i++) {
                    System.out.println("You won and guessed the number correctly!");
                }
                break; 
            }
        }

        scanner.close();
    }
}

