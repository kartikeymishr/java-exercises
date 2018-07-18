import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadRootTest {
    private QuadRoot quad;

    @Before
    public void init() {
        quad = new QuadRoot();
    }

    @After
    public void tearDown() {
        quad = null;
    }

    @Test
    public void isPowerOf4() {

        int numTest = 16;
        assertTrue(quad.isPowerOf4(numTest));

        int numTest2 = 32;
        assertFalse(quad.isPowerOf4(numTest2));

        int numTest3 = 64;
        assertTrue(quad.isPowerOf4(numTest3));

        int numTest4 = 2;
        assertFalse(quad.isPowerOf4(numTest4));
    }
}