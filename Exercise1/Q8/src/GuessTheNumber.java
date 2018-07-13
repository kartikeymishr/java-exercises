import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int min = 1;
        int max = 100;
        int target = random.nextInt((100 - 1) + 1) + 1;
        int guess = -1;

        while (guess != target) {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < max && guess > min) {
                if (guess < target) {
                    System.out.println("Number guessed is less than original number");
                } else if (guess > target) {
                    System.out.println("Number guessed is more than original number");
                } else {
                    System.out.println("Number guessed matches the original number");
                }
            } else {
                System.out.println("Please enter a number in the range of " + min + " and " + max);
            }
        }
    }
}
