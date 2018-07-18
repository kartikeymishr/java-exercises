import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeInputTest {
    private PalindromeInput pal;

    @Before
    public void init() {
        pal = new PalindromeInput();
    }

    @After
    public void tearDown() {
        pal = null;
    }

    @Test
    public void isPalindrome() {
        //Given
        String palTest = "racecar";
        assertTrue(pal.isPalindrome(palTest));

        String palTest1 = "food";
        assertFalse(pal.isPalindrome(palTest1));

        String palTest2 = "2332";
        assertTrue(pal.isPalindrome(palTest2));


    }
}