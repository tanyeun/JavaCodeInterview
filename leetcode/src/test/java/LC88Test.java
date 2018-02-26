import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LC88Test {

    int[] expected;

    @Test
    public void test1(){
        int[] nums1 = {1,2,3,4,0,0,0}; int m = 4;
        int[] nums2 = {5,6,7};         int n = 3;
        expected = new int[] {1,2,3,4,5,6,7};
        test(nums1, m, nums2, n);
    }

    @Test
    public void test2(){
        int[] nums1 = {1,3,5,7,0,0,0}; int m = 4;
        int[] nums2 = {2,4,6};         int n = 3;
        expected = new int[] {1,2,3,4,5,6,7};
        test(nums1, m, nums2, n);
    }

    @Test
    public void test3(){
        int[] nums1 = {0}; int m = 0;
        int[] nums2 = {1}; int n = 1;
        expected = new int[] {1};
        test(nums1, m, nums2, n);
    }

    @Test
    public void test4(){
        int[] nums1 = {2,0}; int m = 1;
        int[] nums2 = {1}; int n = 1;
        expected = new int[] {1,2};
        test(nums1, m, nums2, n);
    }

    @Test
    public void test5(){
        int[] nums1 = {1,2,0,0}; int m = 2;
        int[] nums2 = {3,4}; int n = 2;
        expected = new int[] {1,2,3,4};
        test(nums1, m, nums2, n);
    }

    private void test(int[] nums1, int m, int[] nums2, int n){
        //LC88.merge(nums1, m, nums2, n);
        //LC88.merge2(nums1, m, nums2, n);
        LC88.merge3(nums1, m, nums2, n); //Best solution
        //System.out.println(Arrays.toString(nums1));
        assertEquals(true, AssertUtils.sameIntArray(expected, nums1));

    }
}