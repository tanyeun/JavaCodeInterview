import org.junit.Test;
import sun.awt.image.ImageWatched;

public class ReverseSingleSublistTest {

    ListNode<Integer> expected;
    ListNode<Integer> list;
    int s;
    int f;

    @Test
    public void reverseSublist1() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3);
        System.out.println(expected.toString());
        list = LinkedListUtil.createLinkedList(3, 2, 1);
        System.out.println(list.toString());
        s = 1;
        f = 3;

        test(expected, list, s, f);
    }

    @Test
    public void reverseSublist2() {
        expected = LinkedListUtil.createLinkedList(1, 2, 6, 5, 4, 3, 7, 8, 9);
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        s = 3;
        f = 6;

        test(expected, list, s, f);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list, int s, int f) {
        ListNode<Integer> result = ReverseSingleSublist.reverseSublist(list, s, f);
        LinkedListUtil.print(result);
        LinkedListUtil.assertSameList(expected, result);
    }

}