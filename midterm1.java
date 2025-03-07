//JULEN MOSS
//
import java.util.Scanner;

public class midterm1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int myNum = 6; 
      
        System.out.println("Guess the number I am thinking of between 1 and 10:");

        int userNum = scanner.nextInt();

        if (userNum == myNum) {
            System.out.println("Congratulations!You've won a cruize!");
        } else {
            System.out.println("Sorry, you guessed incorrectly.");
        }

     
        scanner.close();
    }
}

