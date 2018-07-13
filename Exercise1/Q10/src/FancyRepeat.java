import java.util.Scanner;

public class FancyRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FancyRepeat fr = new FancyRepeat();

        String input;
        int number;

        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        fr.fancyRepeat(input, number);
    }

    public void fancyRepeat(String in, int n) {
        System.out.print(in);
        for (int j = 0; j < n; j++) {
            for (int i = in.length() - n; i < in.length(); i++) {
                System.out.print(in.charAt(i));
            }
        }
    }
}
