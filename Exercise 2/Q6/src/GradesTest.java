import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
    private Grades gd;


    @After
    public void tearDown() {
        gd = null;
    }

    @Test
    public void minimumGrade() {
        int[] mins = {95, 65, 75, 85, 75};
        gd = new Grades(5, mins);
        int min = 65;
        assertEquals(min, gd.minimumGrade());

    }

    @Test
    public void maximumGrade() {
        int[] mins = {95, 65, 75, 85, 75};
        gd = new Grades(5, mins);
        int max = 95;
        assertEquals(max, gd.maximumGrade());
    }

    @Test
    public void averageGrade() {
        int[] mins = {95, 65, 75, 85, 75};
        gd = new Grades(5, mins);
        double avg= 79.00;
        assertEquals(avg, gd.averageGrade(),0.0);
    }
}