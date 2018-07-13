import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelOrConsonant vc = new VowelOrConsonant();

        System.out.println("Enter a string");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        if (chars.length > 1) {
            if (vc.checkRange(chars)) {
                System.out.println(input);

                for (int i = 0; i < chars.length; i++) {
                    System.out.print(chars[i] + " - ");
                    if (!Character.isDigit(chars[i])) {
                        switch (chars[i]) {
                            case 'a':
                            case 'A':
                            case 'e':
                            case 'E':
                            case 'i':
                            case 'I':
                            case 'o':
                            case 'O':
                            case 'u':
                            case 'U':
                                System.out.print("Vowel ");
                                break;
                            default:
                                System.out.print("Consonant ");
                        }
                    } else {
                        System.out.println("Input is a number ");
                    }
                }
            } else {
                System.out.println("ERROR: Input isn't a letter");
            }
        } else {
            System.out.println("Please enter a string with more than one character");
        }
    }

    public boolean checkRange(char[] charArray) {
        boolean flag = false;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z')) {
                flag = true;
            }
        }
        return flag;
    }
}
