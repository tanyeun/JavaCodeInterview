import org.junit.Test;

public class printLinkedListInReverseTest {

    private ListNode<Integer> input;
    private ListNode<Integer> expected;
    private ListNode<Integer> output;

    @Test
    public void test1(){
        input = LinkedListUtil.createLinkedList(0, 2, 4, 1, 3);
        printLinkedListInReverse.print(input);
    }

    @Test
    public void test2(){
        input = LinkedListUtil.createLinkedList(0, 2, 4, 1, 3);
        expected = LinkedListUtil.createLinkedList(3, 1, 4, 2, 0);
        output = printLinkedListInReverse.reverse(input);
        LinkedListUtil.assertSameList(expected, output);

    }


}
