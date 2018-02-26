import java.util.Arrays;

public class LC88 {

    /* Merge Sorted Array

       Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
       as one sorted array.

       Note:
         You may assume that nums1 has enough space (size that is greater or
         equal to m + n) to hold additional elements from nums2.
         The number of elements initialized in nums1 and nums2
         are m and n respectively.
     */

    // Start from front will waste a copy of nums1
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] copy = Arrays.copyOf(nums1, m);
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < m && j < n){
            nums1[k++] = copy[i] < nums2[j] ? copy[i++] : nums2[j++];
        }

        while ( i < m)
            nums1[k++] =  copy[i++];
        while ( j < n)
            nums1[k++] =  nums2[j++];
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        int last = m+n-1;
        int first = m - 1;
        int second = n - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[last] = nums1[first];
                first--;
            } else {
                nums1[last] = nums2[second];
                second--;
            }
            last--;
        }

        // This method is conceptually harder to understand
        if (first < 0) {
            for (int i = 0; i <= last; i++) {
                nums1[i] = nums2[i];
            }
        }
    }

    // Start from rear is because we want to reuse nums1
    // If we start from the front, then there might be elements overlaps
    //    new values and lost the original value forever
    public static void merge3(int[] nums1, int m, int[] nums2, int n){
        int last = m+n-1;
        int first = m - 1;
        int second = n - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[last] = nums1[first];
                first--;
            } else {
                nums1[last] = nums2[second];
                second--;
            }
            last--;
        }

        // This is the case where after the first loop
        // Some remaining smaller items in nums2 not copy to nums1 yet
        // We don't need to check "first >= 0" because if there's
        // any remaining items, it's in nums1 already
        while( second >= 0 ){
            nums1[last] = nums2[second];
            last--;
            second--;
        }
    }
}
