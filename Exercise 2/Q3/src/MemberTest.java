import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    private Member member;

    @Before
    public void init() {
        member = new Member("Cristiano", 33, 250000);
    }

    @After
    public void tearDown() {
        member = null;
    }

    @Test
    public void getName() {
        assertEquals("Cristiano", member.getName());
    }

    @Test
    public void getAge() {
        assertEquals(33, member.getAge());
    }


    @Test
    public void getSalary() {
        assertEquals(250000, member.getSalary(), 0);
    }


}