import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeKLargestTest {

    private List<Integer> expected;
    private List<Integer> list;
    private int k;

    @Test
    public void kLargestInBinaryHeap1() throws Exception {
        expected = Arrays.asList(7,8,9);
        list = Arrays.asList(9,8,7,5,3,4,6,1,2);
        k = 3;

        test(expected,list,k);
    }

    @Test
    public void kLargestInBinaryHeap2() throws Exception {
        expected = Arrays.asList(5,6,7,8,9);
        list = Arrays.asList(9,8,7,5,3,4,6,1,2);
        k = 5;

        test(expected,list,k);
    }

    @Test
    public void kLargestInBinaryHeap3() throws Exception {
        //expected = Arrays.asList(561,314,401,359);
        expected = Arrays.asList(314,359,401,561);
        list = Arrays.asList(561,314,401,28,156,359,271,11,3);
        k = 4;

        test(expected,list,k);
    }

    private void test(List<Integer> expected, List<Integer> list, int k) {
        List<Integer> result = ComputeKLargest.kLargestInBinaryHeap(list, k);
        try {
            for (Integer i : expected) {
                if (!result.contains(i))
                    throw new AssertionError();
            }
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+expected.toString());
            errorMessage.append("\nActual: "+result.toString()+"\n");
            fail(errorMessage.toString());
        }
    }
}