import java.util.Scanner;

public class QuadRoot {

    public boolean isPowerOf4(int number) {
        if (number == 0) {
            return false;
        }

        while (number != 1) {
            if (number % 4 != 0) {
                return false;
            }
            number = number / 4;
        }

        return true;
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
