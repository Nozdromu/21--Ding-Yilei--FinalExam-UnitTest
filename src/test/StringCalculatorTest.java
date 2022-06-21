import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator mystring;

    @BeforeEach
    public void setUp() {
        mystring = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        mystring = null;
    }
    @Test
    public void test1(){
        assertEquals(1000,mystring.add("1,999"));
    }
    @Test
    public void test2(){
        assertEquals(1,mystring.add("1,1000"));
    }
    @Test
    public void test3(){
        assertThrows(IllegalArgumentException.class,()->mystring.add("-1,100"));
    }
}
