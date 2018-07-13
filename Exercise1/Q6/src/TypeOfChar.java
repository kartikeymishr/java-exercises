import java.util.Scanner;

public class TypeOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char value = scanner.next().charAt(0);

        if (Character.isUpperCase(value)) {
            System.out.println("Capital Letter");
        } else if (Character.isLowerCase(value)) {
            System.out.println("Small Letter");
        } else if (Character.isDigit(value)) {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }
    }
}

