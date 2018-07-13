import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of numbers: ");
        String input = scanner.nextLine();

        String numbers[] = input.split("\\s");
        int sum = 0;

        scanner.close();

        for (String number : numbers) {
            int n = 0;

            try {
                n = Integer.parseInt(number);
                sum += n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only integers as input");
                sum = 0;
            }
        }

        if (sum != 0) {
            System.out.println("Sum is " + sum);
        }
    }

}

