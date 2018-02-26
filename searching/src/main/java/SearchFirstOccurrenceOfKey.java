import java.util.List;

public class SearchFirstOccurrenceOfKey {
    public static int bsearch(List<Integer> A, int k){
        int left = 0;
        int right = A.size()-1;
        int result = -1;

        while( left <= right){
            int mid = left + (right-left) / 2;
            // Ascending order
            if( A.get(mid) < k ){
                left = mid + 1;
            }else if ( A.get(mid) == k){
                result = mid;
                right = mid - 1;
            }else
                right = mid - 1;
        }
        return result;
    }
}
