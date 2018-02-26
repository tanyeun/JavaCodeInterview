import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.fail;

public class EvenOddTest {
    int[] expected;

    @Test
    public void test_1(){
        expected = new int[] {2, 10, 14, 1, 5, 3, 5, 9};
        int[] input = {1, 5, 2, 10, 3, 5, 9, 14};

        test(input);

    }
    private void test(int[] input) {
        try {
            EvenOdd.evenOdd(input);
            boolean isOdd = false;
            for (int i = 0; i < input.length; i++) {
                // input contains element not in expected
                int index = Basics.arrayFindInt(expected, input[i]);
                if ( index == -1 ) {
                    StringBuilder errorMessage = new StringBuilder();
                    errorMessage.append("\n"+input[i]+" not found in expected\n");
                    throw new AssertionError(errorMessage.toString());
                }
                if( input[i] % 2 != 0 ) isOdd = true; // found an odd element
                if( isOdd == true ){
                    if( input[i] % 2 == 0 ){
                        throw new AssertionError("Found even after odd");
                    }
                }

            }
        } catch (AssertionError e) {
            fail(e.toString());
        }
    }
}
