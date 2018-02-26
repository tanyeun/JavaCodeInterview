import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LC56Test {
    List<Interval> expected;

    @Test
    public void test1(){
        int[][] input = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] answer = { {1,6}, {8,10}, {15,18} };
        List<Interval> inputList = Interval.fromArray(input);
        expected = Interval.fromArray(answer);
        test(inputList);
    }

    @Test
    public void test2(){
        int[][] input = { {6,10}, {2,4}, {11,15}, {1,8} };
        int[][] answer = { {1,10}, {11,15} };
        List<Interval> inputList = Interval.fromArray(input);
        expected = Interval.fromArray(answer);
        test(inputList);
    }


    private void test(List<Interval> input){
        List<Interval> actual = LC56.merge(input);
        int i = 0;
        int j = 0;
        try {
            for(;i<actual.size();){
                assertEquals(true, Interval.equals(actual.get(i), expected.get(j)));
                i++;
                j++;
            }
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: ["+expected.get(j).start+
                                           ", "+expected.get(j).end+"]\n");
            errorMessage.append("\nActual: ["+actual.get(i).start+
                                         ", "+actual.get(i).end+"]\n");
            fail(errorMessage.toString());
        }
    }

}
