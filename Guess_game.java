import java.util.Random;
import java.util.Scanner;

public class Guess_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int rounds = 0;

        while (true) {
            rounds++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            System.out.println("Round " + rounds + "! I'm thinking of a number between 1 and 100.");
            System.out.println("You have 6 attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Game over! The number was " + numberToGuess + ".");
            } else {
                System.out.println("You won this round!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Your final score is " + score + " out of " + rounds + " rounds.");
    }
}