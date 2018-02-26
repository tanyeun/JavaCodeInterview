public class MergeSortedLists {

    /*
       7.1 Merge two sorted lists
    */
    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> dummyHead = new ListNode<>(0, null);
        ListNode<Integer> merged = dummyHead;
        ListNode<Integer> l1 = list1, l2 = list2;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }

        // Connect the remaining l1 or l2
        merged.next = l1 != null ? l1 : l2;
        return dummyHead.next;
    }
}
