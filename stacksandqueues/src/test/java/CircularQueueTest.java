import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CircularQueueTest {

    //private final int capacity = 10;
    private final int capacity = 5;
    private int size;

    @Test
    public void circularQueue1() throws Exception {
        size = 5;

        test(size);
    }

    @Test
    public void circularQueue1_1() throws Exception {
        final CircularQueue2 queue = new CircularQueue2(capacity);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(9);
        System.out.println(queue.dequeue());
        queue.enqueue(13);
        queue.enqueue(33);
        System.out.println(queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(22);
        queue.enqueue(32);
        queue.enqueue(34);

    }

    @Test
    public void circularQueue2() throws Exception {
        size = 10;

        test(size);
    }

    @Test
    public void circularQueue2_1() throws Exception {
        size = 12;

        test(size);
    }

    @Test
    public void circularQueue3() throws Exception {
        size = 50;

        test(size);
    }

    private void test(int size) {
        //final CircularQueue queue = new CircularQueue(capacity);
        final CircularQueue2 queue = new CircularQueue2(capacity);
        List<Integer> integers = StreamUtil.sequence(size);
        integers.forEach(
                i -> queue.enqueue(i)
        );
        integers.forEach(
                i -> assertEquals(i,queue.dequeue())
        );
    }

}