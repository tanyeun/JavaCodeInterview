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
        //output = printLinkedListInReverse.reverse(input);
        output = printLinkedListInReverse.reverse_v2(input);
        LinkedListUtil.assertSameList(expected, output);
    }

    @Test
    public void test3(){
        input = LinkedListUtil.createLinkedList(1, 2, 3);
        expected = LinkedListUtil.createLinkedList(3, 2, 1);
        //output = printLinkedListInReverse.reverse(input);
        output = printLinkedListInReverse.reverse_v2(input);
        LinkedListUtil.assertSameList(expected, output);
    }

    @Test
    public void test4() {
        expected = LinkedListUtil.createLinkedList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        output = printLinkedListInReverse.reverse_v2(input);

        LinkedListUtil.assertSameList(expected, output);
    }


}
