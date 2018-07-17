import java.util.Scanner;

public class QuadRoot {
    private double quadRoot;

    public boolean isPowerOf4(int number) {
        quadRoot = Math.pow(number, 1.0 / 4.0);
        if (number % quadRoot == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadRoot qr = new QuadRoot();

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if (qr.isPowerOf4(input)) {
            System.out.println("Number is a power of 4");
        } else {
            System.out.println("Number is not a power of 4");
        }
    }
}
