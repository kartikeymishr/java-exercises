import java.util.Scanner;

public class PalindromeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String original, reverse = "";

        System.out.println("Enter a string: ");
        original = scanner.nextLine();

        for (int i = 0; i < original.length(); i++) {
            reverse += original.charAt(i);
        }

        if (reverse.equals(original)) {
            System.out.println("Input is a palindrome");
        } else {
            System.out.println("Input is not a palindrome");
        }
    }
}
