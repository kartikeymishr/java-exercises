import java.util.Scanner;

public class SortingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        long remainder;
        int i = 0;
        int sum = 0;
        int length = Long.toString(num).length();
        long[] arr = new long[length];

        // Sorting numbers in an array
        for (int j = 0; j < length; j++) {
            for (int k = j + 1; k < length; k++) {
                if (arr[j] < arr[k]) {
                    long temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        // Calculating sum of even numbers
        while (num != 0) {
            remainder = num % 10;
            arr[i] = remainder;
            if (num % 2 == 0) {
                sum += remainder;
            }
            num = num / 10;
            i++;
        }

        System.out.print("Sorted number in non-increasing order: ");

        for (int j = 0; j < length - 1; j++) {
            System.out.print(arr[j]);
        }
        System.out.println();

        System.out.println("Sum of even numbers: " + sum);

        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
