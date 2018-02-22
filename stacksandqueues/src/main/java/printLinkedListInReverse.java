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
}
