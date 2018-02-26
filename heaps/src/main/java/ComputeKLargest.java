import java.util.*;

public class ComputeKLargest {

    /*
    10.6 Compute the k largest elemetns in a max-heap

         Given a max-heap represented as an array
         Find the k largest elements
    */

    private static class HeapEntry{
        public Integer index;
        public Integer value;

        public HeapEntry(Integer id, Integer val){
            this.index = id;
            this.value = val;
        }
    }

    private static class Compare implements Comparator<HeapEntry> {
        @Override
        public int compare(HeapEntry o1, HeapEntry o2){
            return Integer.compare(o2.value, o1.value);
        }

        public static final Compare COMPARE_HEAP_ENTRIES = new Compare();
    }

    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    public static List<Integer> kLargestInBinaryHeap(final List<Integer> list, int k) {
        if( k <= 0 ){
            return Collections.EMPTY_LIST;
        }

        // This is essential to make PriorityQueue from min-heap to max-heap
        // The new compare function override above swap the position of o1, o2
        // when doing the actual comparision
        PriorityQueue<HeapEntry> candidateMaxHeap = new PriorityQueue<>(
                DEFAULT_INITIAL_CAPACITY, Compare.COMPARE_HEAP_ENTRIES);
        candidateMaxHeap.add(new HeapEntry(0, list.get(0)));

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; ++i){
            Integer candidateIdx = candidateMaxHeap.peek().index;
            result.add(candidateMaxHeap.remove().value);

            Integer leftChildIdx = 2 * candidateIdx + 1;
            if( leftChildIdx < list.size())
                candidateMaxHeap.add(new HeapEntry(leftChildIdx, list.get(leftChildIdx)));
            Integer rightChildIdx = 2 * candidateIdx + 2;
            if( rightChildIdx < list.size())
                candidateMaxHeap.add(new HeapEntry(rightChildIdx, list.get(rightChildIdx)));
        }
        return result;
    }
}
