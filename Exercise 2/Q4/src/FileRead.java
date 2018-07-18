import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    private String inputFromFile;

    public FileRead() {
        inputFromFile = "";
    }

    public String readFileContent(FileReader fileReader) {
        Scanner scanner = new Scanner(fileReader);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.next() + " ");
        }
        this.inputFromFile = sb.toString().trim();
        scanner.close();
        return this.inputFromFile;
    }

    public String printContent() {
        String upperCaseInput = this.inputFromFile.toUpperCase();
        if (!(this.inputFromFile.length() == 0)) {
            System.out.println("Contents of file: ");
            System.out.println(upperCaseInput);
            System.out.println("Length of file: ");
            System.out.println(this.inputFromFile.length());
        }
        return upperCaseInput;
    }


    public static void main(String[] args) throws FileNotFoundException {
        FileRead fr = new FileRead();
        FileReader fileReader = new FileReader("/home/kartikey/Desktop/java-exercises/Exercise 2/Q4/fox");

        fr.readFileContent(fileReader);
        fr.printContent();
    }
}
