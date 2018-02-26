import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56 {
    /*
       Merge Intervals
          Given a collection of intervals, merge all overlapping intervals.
     */
    public static List<Interval> merge(List<Interval> intervals) {
        // sort start&end
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        // sort starts and ends to make sure they align in order
        // the rearrangement make sure if it overlaps, it overaps
        // from the right end, so we can just compare the next start
        // against the current end
        Arrays.sort(starts);
        Arrays.sort(ends);
        // loop through
        List<Interval> res = new ArrayList<Interval>();
        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
            // check i == n-1 is to prevent starts[i+1] go out of bound
            // check the next start against the current end
            // if the next start is smaller than the current end
            // means they overlap and can be merged
            if (i == n - 1 || starts[i + 1] > ends[i]) {
                res.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return res;
    }
}
