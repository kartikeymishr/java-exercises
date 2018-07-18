import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialsTest {
    Factorials fact;

    @Before
    public void init() {
        fact = new Factorials();
    }

    @After
    public void tearDown() {
        fact = null;
    }

    @Test
    public void factorial() {
        int num = 0;
        assertEquals(1, fact.factorial(num));

        int num1 = 5;
        assertEquals(120, fact.factorial(num1));

        int num2 = 10;
        assertEquals(3628800, fact.factorial(num2));
    }

    @Test
    public void intFactorials() {
        assertEquals(1932053504, fact.intFactorials());
    }

    @Test
    public void longFactorials() {
        assertEquals(2432902008176640000.00, fact.longFactorials(), 0);
    }
}