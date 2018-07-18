import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class FileReadTest {
    FileRead fr = new FileRead();

    FileReader fileReader;

    @Before
    public void init() {
        try {
            fileReader = new FileReader("/home/kartikey/Desktop/java-exercises/Exercise 2/Q4/assgn.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        }
    }

    @Test
    public void readFileContent() {
        assertEquals("main-class: Calculator", fr.readFileContent(fileReader));
    }

    @Test
    public void printContent() {
        fr.readFileContent(fileReader);
        assertEquals("MAIN-CLASS: CALCULATOR", fr.printContent());
    }
}