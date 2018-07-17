import java.util.Scanner;

public class PalindromeInput {
    private String reverse;

    public boolean isPalindrome(String input) {
        reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        if (reverse.equals(input)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeInput pi = new PalindromeInput();

        String original;

        System.out.println("Enter a string: ");
        original = scanner.nextLine();

        if (pi.isPalindrome(original)) {
            System.out.println("Input is palindrome");
        } else {
            System.out.println("Input is not palindrome");
        }
    }
}
