package testsrc;

import org.junit.jupiter.api.Test;
import practice.Arrays2;

import static org.junit.jupiter.api.Assertions.*;

class Arrays2Test {

    @Test
    public void test1() {
        int expected = 17;
        Boolean[] actual = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        assertEquals(expected, new Arrays2().countSheeps(actual));
    }

    @Test
    public void test2() {
        int expected = 14;
        Boolean[] actual = {true,  true,  null,  false,
                true,  true,  true,  true,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true};
        assertEquals(expected, new Arrays2().countSheeps(actual));
    }

    @Test
    public void test3() {
        int expected = 0;
        Boolean[] actual = {false,  false,  null,  false};
        assertEquals(expected, new Arrays2().countSheeps(actual));
    }
}