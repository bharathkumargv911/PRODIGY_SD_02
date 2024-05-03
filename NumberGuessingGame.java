import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int generatedNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("Welcome to the Number Guessing Game!");
            while (!correctGuess) {
                System.out.println("Enter your guess:");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess > generatedNumber) {
                    System.out.println("Your guess is too high. Try again!");
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    correctGuess = true;
                }
            }

            System.out.printf("Congratulations! You correctly guessed the number in %d attempts.\n", attempts);
            System.out.println("Do you want to play the game again? (yes/no)");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        scanner.close();

        System.out.println("Thank you for playing!");
    }
}