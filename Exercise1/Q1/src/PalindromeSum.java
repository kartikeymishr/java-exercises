import java.util.Scanner;

public class PalindromeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeSum palindromeSum = new PalindromeSum();

        long number;

        System.out.println("Enter a number: ");
        number = scanner.nextLong();

        if (palindromeSum.isPalindrome(number)) {
            // If number is a palindrome
            int sumOfEven = palindromeSum.computeSum(number);
            if (sumOfEven > 25) {
                System.out.println(number + " is palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(number + " is palindrome and the sum of even numbers is less than 25");
            }
        } else {
            // If number is not a palindrome
            System.out.println(number + " is not palindrome");
        }

    }

    public boolean isPalindrome(long palindrome) {
        long reverse = 0;
        long original = palindrome;

        while (palindrome != 0) {
            long remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }

        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }

    public int computeSum(long number) {
        int sum = 0;

        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                sum += (number % 10);
            }
            number /= 10;
        }

        return sum;
    }
}
