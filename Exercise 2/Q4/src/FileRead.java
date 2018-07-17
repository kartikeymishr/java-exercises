import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        String inputFromFile = "";

        try {
            Scanner scanner = new Scanner(new FileReader("/home/kartikey/Desktop/java-exercises/Exercise 2/Q4/fox"));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.next() + " ");
            }
            inputFromFile = sb.toString();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
            e.printStackTrace();
        }

        if (!(inputFromFile.length() == 0)) {
            System.out.println("Contents of file: ");
            System.out.println(inputFromFile.toUpperCase());
            System.out.println("Length of file: ");
            System.out.println(inputFromFile.length());
        }
    }
}
