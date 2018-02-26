import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchFirstOccurrenceOfKeyTest {
    int expected;
    int key;

    @Test
    public void test1(){
        Integer[] ary = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        expected = 3;
        key = 108;
        test(ary, expected, key);
    }

    @Test
    public void test2(){
        Integer[] ary = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        expected = 6;
        key = 285;
        test(ary, expected, key);
    }

    private void test(Integer[] ary, int answer, int k){
        int result = SearchFirstOccurrenceOfKey.bsearch(Arrays.asList(ary), k);
        assertEquals(answer, result);
    }
}
