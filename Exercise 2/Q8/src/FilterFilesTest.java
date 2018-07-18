import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class FilterFilesTest {
    File folder = new File("/home/kartikey/Desktop");
    File[] listOfFiles = folder.listFiles();
    FilterFiles filtfile;

    @Before
    public void init() {
        filtfile = new FilterFiles();
    }

    @After
    public void tearDown() {
        filtfile = null;
    }

    @Test
    public void listing() throws FileNotFoundException {

        java.util.List<String> listOfJavaFiles=new ArrayList<String>();
        listOfJavaFiles.add("Calculator.java");
        listOfJavaFiles.add("MiniCalc.java");


        assertEquals(listOfJavaFiles, filtfile.listing(listOfFiles, ".java"));
    }

    @Test
    public void readContents() {
    }
}