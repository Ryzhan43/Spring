import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){
        fail("not implemented yet");
    }
    @Test
    void testCase2(){}
    @Test
    void testCase3(){
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }
    @Test
    void testCase4(){
        String nullString = null;
        String notNullString = "not null";
        assertNull(nullString);
        assertNotNull(notNullString);

    }
    @Test
    void testCase5(){
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void add() {
        int actual = Calculator.add(2,3);

        assertEquals(5, actual, "Test failed");
    }

}