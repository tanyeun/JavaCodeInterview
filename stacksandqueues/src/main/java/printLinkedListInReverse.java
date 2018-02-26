import java.util.ArrayDeque;
import java.util.Deque;

public class printLinkedListInReverse {
    public static void print(ListNode<Integer> head){
        Deque<Integer> nodes = new ArrayDeque<>();
        while( head != null ){
            nodes.addFirst(head.data);
            head = head.next;
        }
        while( !nodes.isEmpty() ){
            // poll : retrieve and remove the head from the stack
            //        return null if empty
            System.out.println(nodes.poll());
        }
    }

    // Time: O(N)
    // Space: O(N), use a stack to save the nodes
    public static ListNode<Integer> reverse(ListNode<Integer> head){
        Deque<Integer> nodes = new ArrayDeque<>();
        while( head != null ){
            nodes.addFirst(head.data);
            head = head.next;
        }
        ListNode<Integer> dummyHead = new ListNode<>();
        ListNode<Integer> current = dummyHead;
        while( !nodes.isEmpty() ){
            ListNode<Integer> n = new ListNode<>(nodes.poll());
            current.next = n;
            current = current.next;
        }
        return dummyHead.next;
    }

    // Similiar to ReverseSingleSublist
    // Time: O(N)
    // Space: O(1)
    public static ListNode<Integer> reverse_v2(ListNode<Integer> head){
        ListNode<Integer> dummyHead = new ListNode<>(0, head);
        ListNode<Integer> current = dummyHead.next;
        ListNode<Integer> back = dummyHead.next;

        int size = 0;
        while( current != null ){
            size+=1;
            current = current.next;
        }

        while(--size != 0){
           ListNode<Integer> front = back.next;
           back.next = front.next;
           front.next = dummyHead.next;
           dummyHead.next = front;
        }

        return dummyHead.next;
    }
}
