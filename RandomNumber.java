import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println("Guess a number between 1 and 10:");
                    int userGuess = input.nextInt();
                    
                    if (userGuess == numberToGuess) {
                        System.out.println("Congratulations! You guessed the number.");
                        break;
                    } else {
                        System.out.println("Sorry, wrong guess. Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();  // discard the invalid input
                }
            }
        } 
    }
}
