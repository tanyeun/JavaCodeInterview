import sun.awt.image.ImageWatched;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello LinkedList");
        List<Character> alist = new ArrayList<>(); //Dynamic Array
        alist.add('A');
        alist.add('B');
        alist.add('C');
        alist.add('D');
        System.out.println(alist.toString());
        alist.add(1, '+');
        System.out.println(alist.toString());
        System.out.println(alist.get(4));
        alist.set(1, '-');
        System.out.println(alist.toString());
        System.out.println(alist.contains('C'));
        System.out.println(alist.subList(0,3).toString()); // index 0 to 2
        // Iterator that can only read
        Iterator itr = alist.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element+" ");
        }
        System.out.println();

        // Iterator that can also modify entries
        ListIterator itr2 = alist.listIterator();
        while(itr2.hasNext()){
            Object element = itr2.next();
            itr2.set(element+"!");
        }
        // And read from the end
        while(itr2.hasPrevious()){
            Object element = itr2.previous();
            System.out.print(element+" ");
        }
        System.out.println();

        alist.remove(1);
        System.out.println(alist.toString());
        alist.clear();
        System.out.println(alist.toString());

        List<Integer> llist = new LinkedList<>();
        llist.add(16);
        llist.add(10);
        llist.add(8);
        llist.add(29);
        System.out.println(llist.toString());
        System.out.println(Collections.max(llist));
        Collections.swap(llist,0,1);
        System.out.println(llist.toString());
        Collections.fill(llist, 3);
        System.out.println(llist.toString());

        //ListNode<Integer> test = LinkedListUtil.createLinkedList(11,3,5,7,2);
        ListNode<Integer> test = LinkedListUtil.createLinkedList(3,2,1);
        LinkedListUtil.print(test);
    }
}
