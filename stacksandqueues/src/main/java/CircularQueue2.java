import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class CircularQueue2 {

    /*
    8.8 Implement a circular queue
    */

    private int head = 0, tail = 0, numQueueElements = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries;

    public CircularQueue2(int capacity) {
        entries = new Integer[capacity];
    }

    public void enqueue(Integer x) {
        if (numQueueElements == entries.length) {
            resizeBigger();
        }
        entries[tail] = x;
        tail = (tail+1) % entries.length;
        ++numQueueElements;
    }

    public Integer dequeue() {
        if(numQueueElements != 0){
            --numQueueElements;
            Integer temp = entries[head];
            head = (head+1) % entries.length;
            return temp;
        }
        throw new NoSuchElementException("Deque called on an empty queue.");
    }

    public void resizeBigger() {
        // Rotate such that head is at position zero
        Collections.rotate(Arrays.asList(entries), -head);
        // Resets head and tail
        head = 0;
        tail = numQueueElements;
        entries = Arrays.copyOf(entries, numQueueElements * SCALE_FACTOR);
    }

    public int size() {
        return numQueueElements;
    }
}
