import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        String inputFromFile = "";
        File file = new File("/home/kartikey/Desktop/java-exercises/Exercise 2/Q4/fox.txt");

        try {
            Scanner scanner = new Scanner(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.next());
            }
            inputFromFile = sb.toString();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        if (!(inputFromFile.length() == 0)) {
            System.out.println("Contents of file: ");
            System.out.println(inputFromFile);
        }
    }
}
