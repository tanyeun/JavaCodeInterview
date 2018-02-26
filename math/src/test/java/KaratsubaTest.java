import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class KaratsubaTest {
    int expected;

    @Test
    public void test_1(){
        int x = 1234;
        int y = 5678;
        expected = x*y;

        assertEquals(expected, Karatsuba.mul(x,y));
    }

    @Test
    public void test_2(){
        int x = 123;
        int y = 5678;
        expected = x*y;

        assertEquals(expected, Karatsuba.mul(x,y));
    }

}