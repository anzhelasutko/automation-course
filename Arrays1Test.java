package testsrc;
import org.junit.jupiter.api.Test;
import practice.Arrays1;

import static org.junit.jupiter.api.Assertions.*;

public class Arrays1Test {

    @Test
    public void test1() {
        int expected = 12;
        int actual = Arrays1.findSmallestInt(new int[]{15, 78, 24, 12, 89});
        assertEquals(expected, actual, "message");
    }

    @Test
    public void test2() {
        int actual = Arrays1.findSmallestInt(new int[]{15, 78, 24, -50, 89});
        assertTrue(actual == -50);
    }

    @Test
    public void test3() {
        int actual = Arrays1.findSmallestInt(new int[]{15, 78, 24, 50, 0});
        assertFalse(actual > 0, "message");
    }
}