import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SearchFirstOccurGreaterKeyTest {
    int expected;
    int key;

    @Test
    public void test1(){
        Integer[] ary = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        expected = 1;
        key = -13;
        test(ary, expected, key);
    }

    @Test
    public void test2(){
        Integer[] ary = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        expected = 9;
        key = 285;
        test(ary, expected, key);
    }

    @Test
    public void test3(){
        Integer[] ary = {-10, -3, 0, 7, 19};
        expected = 2;
        key = -1;
        test(ary, expected, key);
    }

    @Test
    public void test4(){
        Integer[] ary = {-10, -3, 0, 7, 19};
        expected = 3;
        key = 3;
        test(ary, expected, key);
    }

    private void test(Integer[] ary, int answer, int k){
        int result = SearchFirstOccurGreaterKey.bsearch(Arrays.asList(ary), k);
        assertEquals(answer, result);
    }
}
