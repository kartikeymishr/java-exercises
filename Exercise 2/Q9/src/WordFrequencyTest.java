import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class WordFrequencyTest {
    WordFrequency wf;
    java.util.Map<String, Integer> wordCheck = new HashMap<String, Integer>();

    @Before
    public void init() {
        wf = new WordFrequency("/home/kartikey/Desktop/java-exercises/Exercise 2/Q9/FileDemo");
    }

    @After
    public void tearDown() {
        wf = null;
    }

    @Test
    public void populateWordCountMap() {
        wordCheck.put("sleep", 1);
        wordCheck.put("a", 2);
        wordCheck.put("like", 1);
        wordCheck.put("have", 1);
        wordCheck.put("i", 3);
        wordCheck.put("man", 1);
        wordCheck.put("to", 1);
        wordCheck.put("am", 1);
        wordCheck.put("home", 1);


        assertEquals(wordCheck, wf.populateWordCountMap());
    }

    @Test
    public void displayValues() {
    }
}