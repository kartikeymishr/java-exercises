import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringReverse sr = new StringReverse();

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String reverse = sr.reverseString(input);
        System.out.println(reverse);
    }

    public String reverseString(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = input.length() - 1;
        char temp;

        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }

        return new String(in);
    }
}
