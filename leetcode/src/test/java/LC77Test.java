import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LC77Test {
    private List<List<Integer>> expected;


    @Test
    public void rotateMatix1() {
        expected = Arrays.asList(
                Arrays.asList(2,4),
                Arrays.asList(3,4),
                Arrays.asList(2,3),
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(1,4)
        );
        int n = 4;
        int k = 2;

        test(expected, n, k);
    }

    private void test(List<List<Integer>> expected, int n, int k) {
        List<List<Integer>> actual = LC77.combine(n,k);
        int i = 0;
        try {
            for (; i < actual.size(); i++) {
                if (!expected.contains(actual.get(i)))
                    throw new AssertionError();
            }
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\n"+actual.get(i).toString()+" not found in expected\n");
            fail(errorMessage.toString());
        }
    }
}
