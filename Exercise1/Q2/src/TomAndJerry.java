import java.util.Scanner;

public class TomAndJerry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && (number >= 20 && number <= 30)) {
            // Even
            System.out.println("Jerry");
        } else if (number >= 20 && number <= 30) {
            // Odd
            System.out.println("Tom");
        }
    }
}
