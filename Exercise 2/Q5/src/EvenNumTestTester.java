import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTester {
    private EvenNumTest even;

    @Before
    public void init() {
        even = new EvenNumTest();
    }

    @After
    public void tearDown() {
        even = null;
    }

    @Test
    public void isEven() {
        int evenTest = 20;
        assertTrue(even.isEven(evenTest));

        int evenTest2 = 11;
        assertFalse(even.isEven(evenTest2));

        int evenTest3 = 2;
        assertTrue(even.isEven(evenTest3));
    }
}