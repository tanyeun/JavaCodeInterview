import java.util.List;

public class SearchSorted {

    /*
    11.1 Binary Search
           Time : O(logN)
         requires sorted arrays, which takes O(NlogN) to sort
    */

    public static int search(List<Integer> list, int k) {
        int lo = 0, hi = list.size() - 1, result = -1;
        while (lo <= hi) {
            int i = ((hi - lo) / 2) + lo; // Avoid hi + lo overflow
            if (k < list.get(i)) {
                hi = i - 1;
            } else if (list.get(i) == k) {
                result = i;
                hi = i - 1;
            } else {
                lo = i + 1;
            }
        }
        return result;
    }
}
