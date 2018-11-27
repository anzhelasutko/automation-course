package testsrc;

import org.junit.jupiter.api.Test;
import practice.Arrays3;

import static org.junit.jupiter.api.Assertions.*;

class Arrays3Test {

    @Test
    public void test1() {
        Object[] haystack1 = {"20", "12314", null, "needle", "helloworld", "ololo", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some text", "   ", "needle", "some longer text which nobody reads"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,23,4,234,324,324,"needle",1,2,3,4,5,54};
        assertEquals("found the needle at position 3", Arrays3.findNeedle(haystack1));
        assertEquals("found the needle at position 5", Arrays3.findNeedle(haystack2));
        assertEquals("found the needle at position 18", Arrays3.findNeedle(haystack3));
    }

    @Test
    public void test2() {
        Object[] haystack4 = {"20", "12314", null, "helloworld", "ololo", 2, "3", true, false};
        assertEquals("needle not found", Arrays3.findNeedle(haystack4));
    }

    /*@Test
    public void test3() {
        Object[] haystack5 = null;
        assertNull(Arrays3.findNeedle(haystack5));
    }*/
}