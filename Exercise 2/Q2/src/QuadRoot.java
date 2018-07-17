import java.util.Scanner;

public class QuadRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        double quadRoot = Math.pow(number, 1.0 / 4.0);

        if (number % quadRoot == 0) {
            System.out.println("The number is a power of 4");
        } else {
            System.out.println("The number is not a power of 4");
        }
    }
}
