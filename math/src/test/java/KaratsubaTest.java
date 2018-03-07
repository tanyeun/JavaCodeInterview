import org.junit.Test;
import org.junit.Assert;

import java.math.BigInteger;
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

    @Test
    public void test_3(){
        BigInteger x = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        BigInteger y = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
        BigInteger t = new BigInteger("1");

        BigInteger expectedNum = x.multiply(y);
        System.out.println(expectedNum);
        //assertEquals(expected, Karatsuba.mul(x,y));
    }

}