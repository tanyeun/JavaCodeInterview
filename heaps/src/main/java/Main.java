import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Heap");
        // Min Heap, the root is the smallest
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(9);
        pq.add(3);
        pq.add(23);
        pq.add(73);
        System.out.println(pq.peek()); // Read the root
        System.out.println(pq.poll()); // Pop out the smallest one
        System.out.println(pq.peek());
    }
}
